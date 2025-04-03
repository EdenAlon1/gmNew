package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class brd {
    static int d(int i) {
        return i != 1 ? 0 : 1;
    }

    public static brc e() {
        bqm bqmVar = new bqm();
        bqmVar.c();
        bqmVar.a = bqe.d().a();
        bqmVar.d(but.e().a());
        return bqmVar;
    }

    public static String f(int i) {
        return i != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    public abstract int a();

    public abstract bqe b();

    public abstract but c();
}
