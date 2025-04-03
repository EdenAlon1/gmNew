package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgdl extends fgdv implements fgcm, ffxx, fgfd {
    private final ffqn a;
    private int b;

    public fgdl(Object obj) {
        this.a = new ffqn(obj, ffqo.a);
    }

    private final boolean i(Object obj, Object obj2) {
        int i;
        fgdx[] fgdxVarArr;
        fgho fghoVar;
        synchronized (this) {
            Object obj3 = this.a.a;
            if (obj != null && !ffkj.e(obj3, obj)) {
                return false;
            }
            if (ffkj.e(obj3, obj2)) {
                return true;
            }
            this.a.c(obj2);
            int i2 = this.b;
            if ((i2 & 1) != 0) {
                this.b = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.b = i3;
            fgdx[] fgdxVarArr2 = this.d;
            while (true) {
                fgdo[] fgdoVarArr = (fgdo[]) fgdxVarArr2;
                if (fgdoVarArr != null) {
                    for (fgdo fgdoVar : fgdoVarArr) {
                        if (fgdoVar != null) {
                            while (true) {
                                Object obj4 = fgdoVar.a.get();
                                if (obj4 != null && obj4 != (fghoVar = fgdm.b)) {
                                    fgho fghoVar2 = fgdm.a;
                                    if (obj4 != fghoVar2) {
                                        if (fgdn.a(fgdoVar.a, obj4, fghoVar2)) {
                                            ((ffrh) obj4).w(ffcu.a);
                                            break;
                                        }
                                    } else {
                                        if (fgdn.a(fgdoVar.a, obj4, fghoVar)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.b;
                    if (i == i3) {
                        this.b = i3 + 1;
                        return true;
                    }
                    fgdxVarArr = this.d;
                }
                fgdxVarArr2 = fgdxVarArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (defpackage.ffkj.e(r13, r14) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
    
        if (defpackage.ffcu.a != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (r14 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0079, code lost:
    
        if (((defpackage.fgdq) r13).b(r0) == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x008d, B:16:0x0093, B:18:0x0098, B:20:0x00b8, B:22:0x00c9, B:24:0x00eb, B:25:0x00f0, B:27:0x00f8, B:29:0x00fd, B:34:0x009e, B:37:0x00a5, B:45:0x004d, B:47:0x0058, B:48:0x007e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x008d, B:16:0x0093, B:18:0x0098, B:20:0x00b8, B:22:0x00c9, B:24:0x00eb, B:25:0x00f0, B:27:0x00f8, B:29:0x00fd, B:34:0x009e, B:37:0x00a5, B:45:0x004d, B:47:0x0058, B:48:0x007e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x008d, B:16:0x0093, B:18:0x0098, B:20:0x00b8, B:22:0x00c9, B:24:0x00eb, B:25:0x00f0, B:27:0x00f8, B:29:0x00fd, B:34:0x009e, B:37:0x00a5, B:45:0x004d, B:47:0x0058, B:48:0x007e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ffud] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ffud, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [ffxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00c7 -> B:14:0x008d). Please report as a decompilation issue!!! */
    @Override // defpackage.fgcq, defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgdl.a(ffxy, ffgu):java.lang.Object");
    }

    @Override // defpackage.fgcm, defpackage.fgdj
    public final Object c() {
        fgho fghoVar = fgfg.a;
        Object obj = this.a.a;
        if (obj == fghoVar) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.fgcq
    public final List d() {
        return ffdx.b(c());
    }

    @Override // defpackage.fgcl
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.fgcm
    public final void f(Object obj) {
        if (obj == null) {
            obj = fgfg.a;
        }
        i(null, obj);
    }

    @Override // defpackage.fgcl, defpackage.ffxy
    public final Object fQ(Object obj, ffgu ffguVar) {
        f(obj);
        return ffcu.a;
    }

    @Override // defpackage.fgcm
    public final boolean g(Object obj, Object obj2) {
        if (obj == null) {
            obj = fgfg.a;
        }
        if (obj2 == null) {
            obj2 = fgfg.a;
        }
        return i(obj, obj2);
    }

    @Override // defpackage.fgcl
    public final boolean h(Object obj) {
        f(obj);
        return true;
    }

    @Override // defpackage.fgfd
    public final ffxx ib(ffhd ffhdVar, int i, int i2) {
        return fgdm.b(this, ffhdVar, i, i2);
    }

    @Override // defpackage.fgdv
    public final /* synthetic */ fgdx j() {
        return new fgdo();
    }

    @Override // defpackage.fgdv
    public final /* bridge */ /* synthetic */ fgdx[] m() {
        return new fgdo[2];
    }
}
