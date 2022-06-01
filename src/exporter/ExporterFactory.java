package exporter;


import model.OutComeType;

public class ExporterFactory {
    public Exporter getExporter(OutComeType outComeType) {
        if (outComeType == OutComeType.XML) {
            return new XmlExporter();
        }
        if (outComeType == OutComeType.XLS) {
            return new XlsExporter();
        }
        if (outComeType == OutComeType.JSON) {
            return new JsonExporter();
        }
        return null;
    }
}


