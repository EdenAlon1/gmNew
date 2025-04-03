package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aizd implements fbba {
    public static String a() {
        cfup cfupVar = aizc.a;
        if (!csjc.e() && !csjc.f()) {
            return "aratea-pa.googleapis.com";
        }
        String str = (String) aizc.a.e();
        return ffkj.e(str, "autopush") ? "autopush-aratea-pa.sandbox.googleapis.com" : ffkj.e(str, "staging") ? "staging-aratea-pa.sandbox.googleapis.com" : "aratea-pa.googleapis.com";
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
