package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfqt {
    public final dfqj a;
    public final dfqs b;
    public final String c;

    public dfqt(String str, dfqj dfqjVar, dfqs dfqsVar) {
        dfwv.o(dfqjVar, "Cannot construct an Api with a null ClientBuilder");
        dfwv.o(dfqsVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = dfqjVar;
        this.b = dfqsVar;
    }
}
