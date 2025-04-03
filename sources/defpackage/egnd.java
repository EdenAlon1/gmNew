package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egnd {
    public static egnm a(eghw eghwVar) {
        engw c = c(eghwVar.b(), 7);
        egmv egmvVar = new egmv();
        c.getClass();
        egmvVar.a = new egmq(c);
        boolean z = true;
        if (c.size() >= eghwVar.b().size() && !eghwVar.d()) {
            z = false;
        }
        egmvVar.b(z);
        egmvVar.b = eghwVar.c();
        return egmvVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static egnm b(egih egihVar, int i, egnc egncVar) {
        engw c = egihVar.c();
        engr engrVar = new engr();
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ewlp ewlpVar = (ewlp) c.get(i2);
            int a = ewlo.a(ewlpVar.e);
            if (a != 0 && a == 2) {
                engrVar.h(ewlpVar);
            }
        }
        engw c2 = c(engrVar.g(), i);
        egmv egmvVar = new egmv();
        egmvVar.a = egncVar.a(c2);
        egmvVar.b(c2.size() < egihVar.c().size() || egihVar.d());
        egmvVar.b = egihVar.b();
        return egmvVar.a();
    }

    private static engw c(engw engwVar, int i) {
        return engwVar.subList(0, Math.min(engwVar.size(), i));
    }
}
