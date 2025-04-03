package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydw {
    public static final /* synthetic */ ydv a(ydu yduVar) {
        eyfy build = yduVar.build();
        build.getClass();
        return (ydv) build;
    }

    public static final /* synthetic */ void b(Iterable iterable, ydu yduVar) {
        yduVar.copyOnWrite();
        ydv ydvVar = (ydv) yduVar.instance;
        ydv ydvVar2 = ydv.a;
        eygr eygrVar = ydvVar.c;
        if (!eygrVar.c()) {
            ydvVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, ydvVar.c);
    }
}
