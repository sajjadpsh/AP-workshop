package Session3.Music;

public class Music {
    private String fileName;
    private String singer;
    private String date;

    public Music(String fileName, String singer, String date) {
        this.fileName = fileName;
        this.singer = singer;
        this.date = date;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Music{" +
                "fileName='" + fileName + '\'' +
                ", singer='" + singer + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
