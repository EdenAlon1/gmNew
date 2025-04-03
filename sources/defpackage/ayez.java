package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayez extends ffhv implements ffjm {
    boolean a;
    Object b;
    int c;
    final /* synthetic */ ayfb d;
    final /* synthetic */ WorkerParameters e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayez(ayfb ayfbVar, WorkerParameters workerParameters, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ayfbVar;
        this.e = workerParameters;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayez) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r12 != r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:7:0x0019, B:8:0x00b8, B:12:0x0022, B:15:0x00a2, B:19:0x00ad, B:22:0x0027, B:23:0x0082, B:26:0x002b, B:27:0x0041, B:29:0x0049, B:31:0x004f, B:34:0x0035), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:7:0x0019, B:8:0x00b8, B:12:0x0022, B:15:0x00a2, B:19:0x00ad, B:22:0x0027, B:23:0x0082, B:26:0x002b, B:27:0x0041, B:29:0x0049, B:31:0x004f, B:34:0x0035), top: B:2:0x0011 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayez.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ayez(this.d, this.e, ffguVar);
    }
}
