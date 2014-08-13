EntityCSV
=========

Flexible, light weight and simpel CSV mapper based on the Java programming language.


Example usage 
=============
  
[The Csv File](#_csvFile) 

[Entity Bean](#_entity) 

[Reading the entities](#_reading) 

<a name="_csvFile"></a>
__The Csv File__ 


The CSV-File of school players:
```csv
"playerID","schoolID","yearMin","yearMax"
"aardsda01","pennst","2001","2001"
"aardsda01","rice","2002","2003"
"abbeybe01","vermont","1888","1892"
```

<a name="_entity"></a>
[Entity Bean]


__Entity bean__ 

```java

import org.entity.csv.annotation.Column;
import org.entity.csv.common.ColumnType;

public class Player {

    @Column(header = "playerID", type = ColumnType.TEXT)
    private String playerID;
    @Column(header = "schoolID", type = ColumnType.TEXT)
    private String schoolID;
    @Column(header = "yearMax", type = ColumnType.INTEGER)
    private int yearMax;
    @Column(header = "yearMin", type = ColumnType.INTEGER)
    private int yearMin;

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public int getYearMax() {
        return yearMax;
    }

    public void setYearMin(int yearMin) {
        this.yearMin = yearMin;
    }

    public String getPlayerID() {
        return playerID;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public int getYearMin() {
        return yearMin;
    }

    public void setYearMax(int yearMax) {
        this.yearMax = yearMax;
    }
```

<a name="_reading"></a>
__Reading entities__ 


As simple as this: 
```java

  CsvClient<Player> csvClient = new CsvClient("C:\\SchoolsPlayers.csv", Player.class);
  List<Player> players = csvClient.readEntities();
  for(Player player:players){
    System.out.println(player.getPlayerID);
	System.out.println(player.getSchoolID);
	System.out.println(player.getYearMax);
	System.out.println(player.getYearMin);
  }
```
