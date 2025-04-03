package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudk {
    public static final /* synthetic */ cudj a(cudi cudiVar) {
        eyfy build = cudiVar.build();
        build.getClass();
        return (cudj) build;
    }

    public static final void b(fbcx fbcxVar, cudi cudiVar) {
        fbcxVar.getClass();
        cudiVar.copyOnWrite();
        cudj cudjVar = (cudj) cudiVar.instance;
        cudj cudjVar2 = cudj.a;
        cudjVar.c = fbcxVar.a();
    }

    public static final /* synthetic */ void c(cubl cublVar, cudi cudiVar) {
        cudiVar.copyOnWrite();
        cudj cudjVar = (cudj) cudiVar.instance;
        cudj cudjVar2 = cudj.a;
        eygr eygrVar = cudjVar.e;
        if (!eygrVar.c()) {
            cudjVar.e = eyfy.mutableCopy(eygrVar);
        }
        cudjVar.e.add(cublVar);
    }

    public static final /* synthetic */ void d(cucl cuclVar, cudi cudiVar) {
        cudiVar.copyOnWrite();
        cudj cudjVar = (cudj) cudiVar.instance;
        cudj cudjVar2 = cudj.a;
        eygr eygrVar = cudjVar.b;
        if (!eygrVar.c()) {
            cudjVar.b = eyfy.mutableCopy(eygrVar);
        }
        cudjVar.b.add(cuclVar);
    }
}
