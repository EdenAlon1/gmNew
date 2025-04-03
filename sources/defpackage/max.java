package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class max implements mbj, mbl {
    private lux A;
    public final EGLDisplay c;
    public final EGLContext d;
    public final EGLSurface e;
    public final mdt f;
    public final Executor g;
    public final lsh h;
    public final mdk j;
    public final lul k;
    public final lul l;
    public final mbk m;
    public final boolean n;
    public boolean o;
    public boolean q;
    public boolean r;
    public lrq s;
    public EGLSurface t;
    public lzp u;
    private final Context v;
    private final lpo w;
    private int x;
    private int y;
    private lzc z;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public mbh p = new maw();
    public final Queue i = new ConcurrentLinkedQueue();

    public max(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, lpo lpoVar, mdt mdtVar, Executor executor, lsh lshVar, mbk mbkVar, int i, boolean z) {
        this.v = context;
        this.c = eGLDisplay;
        this.d = eGLContext;
        this.e = eGLSurface;
        this.w = lpoVar;
        this.f = mdtVar;
        this.g = executor;
        this.h = lshVar;
        this.m = mbkVar;
        this.n = z;
        this.j = new mdk(lpo.i(lpoVar), i);
        this.k = new lul(i);
        this.l = new lul(i);
    }

    private final int b() {
        if (this.m == null) {
            return 1;
        }
        return this.j.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0081 A[Catch: lsf | lty -> 0x01f7, lsf -> 0x01f9, TryCatch #2 {lsf | lty -> 0x01f7, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:16:0x0028, B:18:0x003c, B:19:0x0048, B:21:0x0052, B:23:0x0056, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x0073, B:34:0x007c, B:36:0x0085, B:38:0x0089, B:39:0x0099, B:41:0x009d, B:42:0x00a2, B:44:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b9, B:52:0x00bd, B:55:0x00c5, B:57:0x00d1, B:59:0x00da, B:60:0x00db, B:61:0x00e3, B:64:0x00ee, B:67:0x00f6, B:69:0x012e, B:72:0x0137, B:75:0x0143, B:78:0x0146, B:81:0x00c3, B:82:0x014a, B:84:0x014e, B:86:0x0176, B:87:0x0195, B:95:0x018c, B:98:0x01a2, B:100:0x01a6, B:101:0x0081, B:102:0x0078, B:3:0x01f1), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0078 A[Catch: lsf | lty -> 0x01f7, lsf -> 0x01f9, TryCatch #2 {lsf | lty -> 0x01f7, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:16:0x0028, B:18:0x003c, B:19:0x0048, B:21:0x0052, B:23:0x0056, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x0073, B:34:0x007c, B:36:0x0085, B:38:0x0089, B:39:0x0099, B:41:0x009d, B:42:0x00a2, B:44:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b9, B:52:0x00bd, B:55:0x00c5, B:57:0x00d1, B:59:0x00da, B:60:0x00db, B:61:0x00e3, B:64:0x00ee, B:67:0x00f6, B:69:0x012e, B:72:0x0137, B:75:0x0143, B:78:0x0146, B:81:0x00c3, B:82:0x014a, B:84:0x014e, B:86:0x0176, B:87:0x0195, B:95:0x018c, B:98:0x01a2, B:100:0x01a6, B:101:0x0081, B:102:0x0078, B:3:0x01f1), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[Catch: lsf | lty -> 0x01f7, lsf -> 0x01f9, TryCatch #2 {lsf | lty -> 0x01f7, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:16:0x0028, B:18:0x003c, B:19:0x0048, B:21:0x0052, B:23:0x0056, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x0073, B:34:0x007c, B:36:0x0085, B:38:0x0089, B:39:0x0099, B:41:0x009d, B:42:0x00a2, B:44:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b9, B:52:0x00bd, B:55:0x00c5, B:57:0x00d1, B:59:0x00da, B:60:0x00db, B:61:0x00e3, B:64:0x00ee, B:67:0x00f6, B:69:0x012e, B:72:0x0137, B:75:0x0143, B:78:0x0146, B:81:0x00c3, B:82:0x014a, B:84:0x014e, B:86:0x0176, B:87:0x0195, B:95:0x018c, B:98:0x01a2, B:100:0x01a6, B:101:0x0081, B:102:0x0078, B:3:0x01f1), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073 A[Catch: lsf | lty -> 0x01f7, lsf -> 0x01f9, TryCatch #2 {lsf | lty -> 0x01f7, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:16:0x0028, B:18:0x003c, B:19:0x0048, B:21:0x0052, B:23:0x0056, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x0073, B:34:0x007c, B:36:0x0085, B:38:0x0089, B:39:0x0099, B:41:0x009d, B:42:0x00a2, B:44:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b9, B:52:0x00bd, B:55:0x00c5, B:57:0x00d1, B:59:0x00da, B:60:0x00db, B:61:0x00e3, B:64:0x00ee, B:67:0x00f6, B:69:0x012e, B:72:0x0137, B:75:0x0143, B:78:0x0146, B:81:0x00c3, B:82:0x014a, B:84:0x014e, B:86:0x0176, B:87:0x0195, B:95:0x018c, B:98:0x01a2, B:100:0x01a6, B:101:0x0081, B:102:0x0078, B:3:0x01f1), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[Catch: lsf | lty -> 0x01f7, lsf -> 0x01f9, TryCatch #2 {lsf | lty -> 0x01f7, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:16:0x0028, B:18:0x003c, B:19:0x0048, B:21:0x0052, B:23:0x0056, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x0073, B:34:0x007c, B:36:0x0085, B:38:0x0089, B:39:0x0099, B:41:0x009d, B:42:0x00a2, B:44:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b9, B:52:0x00bd, B:55:0x00c5, B:57:0x00d1, B:59:0x00da, B:60:0x00db, B:61:0x00e3, B:64:0x00ee, B:67:0x00f6, B:69:0x012e, B:72:0x0137, B:75:0x0143, B:78:0x0146, B:81:0x00c3, B:82:0x014a, B:84:0x014e, B:86:0x0176, B:87:0x0195, B:95:0x018c, B:98:0x01a2, B:100:0x01a6, B:101:0x0081, B:102:0x0078, B:3:0x01f1), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[Catch: lsf | lty -> 0x01f7, lsf -> 0x01f9, TryCatch #2 {lsf | lty -> 0x01f7, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:16:0x0028, B:18:0x003c, B:19:0x0048, B:21:0x0052, B:23:0x0056, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x0073, B:34:0x007c, B:36:0x0085, B:38:0x0089, B:39:0x0099, B:41:0x009d, B:42:0x00a2, B:44:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b9, B:52:0x00bd, B:55:0x00c5, B:57:0x00d1, B:59:0x00da, B:60:0x00db, B:61:0x00e3, B:64:0x00ee, B:67:0x00f6, B:69:0x012e, B:72:0x0137, B:75:0x0143, B:78:0x0146, B:81:0x00c3, B:82:0x014a, B:84:0x014e, B:86:0x0176, B:87:0x0195, B:95:0x018c, B:98:0x01a2, B:100:0x01a6, B:101:0x0081, B:102:0x0078, B:3:0x01f1), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd A[Catch: lsf | lty -> 0x01f7, lsf -> 0x01f9, TryCatch #2 {lsf | lty -> 0x01f7, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:16:0x0028, B:18:0x003c, B:19:0x0048, B:21:0x0052, B:23:0x0056, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x0073, B:34:0x007c, B:36:0x0085, B:38:0x0089, B:39:0x0099, B:41:0x009d, B:42:0x00a2, B:44:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b9, B:52:0x00bd, B:55:0x00c5, B:57:0x00d1, B:59:0x00da, B:60:0x00db, B:61:0x00e3, B:64:0x00ee, B:67:0x00f6, B:69:0x012e, B:72:0x0137, B:75:0x0143, B:78:0x0146, B:81:0x00c3, B:82:0x014a, B:84:0x014e, B:86:0x0176, B:87:0x0195, B:95:0x018c, B:98:0x01a2, B:100:0x01a6, B:101:0x0081, B:102:0x0078, B:3:0x01f1), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e A[Catch: lsf | lty -> 0x01f7, lsf -> 0x01f9, TryCatch #2 {lsf | lty -> 0x01f7, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:16:0x0028, B:18:0x003c, B:19:0x0048, B:21:0x0052, B:23:0x0056, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x0073, B:34:0x007c, B:36:0x0085, B:38:0x0089, B:39:0x0099, B:41:0x009d, B:42:0x00a2, B:44:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b9, B:52:0x00bd, B:55:0x00c5, B:57:0x00d1, B:59:0x00da, B:60:0x00db, B:61:0x00e3, B:64:0x00ee, B:67:0x00f6, B:69:0x012e, B:72:0x0137, B:75:0x0143, B:78:0x0146, B:81:0x00c3, B:82:0x014a, B:84:0x014e, B:86:0x0176, B:87:0x0195, B:95:0x018c, B:98:0x01a2, B:100:0x01a6, B:101:0x0081, B:102:0x0078, B:3:0x01f1), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2 A[Catch: lsf | lty -> 0x01f7, lsf -> 0x01f9, TryCatch #2 {lsf | lty -> 0x01f7, blocks: (B:7:0x0010, B:9:0x001a, B:11:0x001e, B:16:0x0028, B:18:0x003c, B:19:0x0048, B:21:0x0052, B:23:0x0056, B:26:0x005c, B:28:0x0063, B:29:0x0068, B:32:0x0073, B:34:0x007c, B:36:0x0085, B:38:0x0089, B:39:0x0099, B:41:0x009d, B:42:0x00a2, B:44:0x00a6, B:47:0x00ac, B:49:0x00b0, B:50:0x00b9, B:52:0x00bd, B:55:0x00c5, B:57:0x00d1, B:59:0x00da, B:60:0x00db, B:61:0x00e3, B:64:0x00ee, B:67:0x00f6, B:69:0x012e, B:72:0x0137, B:75:0x0143, B:78:0x0146, B:81:0x00c3, B:82:0x014a, B:84:0x014e, B:86:0x0176, B:87:0x0195, B:95:0x018c, B:98:0x01a2, B:100:0x01a6, B:101:0x0081, B:102:0x0078, B:3:0x01f1), top: B:6:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.lqg r18, defpackage.lqh r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.max.a(lqg, lqh, long, long):void");
    }

    @Override // defpackage.mbj
    public final void c() {
        this.f.g();
        if (this.m != null) {
            this.j.e();
            this.k.d();
            this.l.d();
        }
        this.i.clear();
        this.o = false;
        lzc lzcVar = this.z;
        if (lzcVar != null) {
            lzcVar.c();
        }
        this.p.w();
        for (int i = 0; i < b(); i++) {
            this.p.c();
        }
    }

    @Override // defpackage.mbj
    public final void d(lqg lqgVar, lqh lqhVar, final long j) {
        this.f.g();
        this.g.execute(new Runnable() { // from class: mat
            @Override // java.lang.Runnable
            public final void run() {
                max.this.h.c(j);
            }
        });
        if (this.m != null) {
            long j2 = 1000 * j;
            lti.c(this.j.a() > 0);
            a(lqgVar, lqhVar, j, j2);
        } else {
            if (this.n) {
                a(lqgVar, lqhVar, j, j * 1000);
            } else {
                this.i.add(Pair.create(lqhVar, Long.valueOf(j)));
            }
            this.p.c();
        }
    }

    @Override // defpackage.mbj
    public final void e() {
        this.f.g();
        lzc lzcVar = this.z;
        if (lzcVar != null) {
            lzcVar.e();
        }
        try {
            this.j.c();
            ltz.s(this.c, this.t);
            ltz.m();
        } catch (lty e) {
            throw new lsf(e);
        }
    }

    @Override // defpackage.mbj
    public final void f(lqh lqhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mbj
    public final void g(Executor executor, mbg mbgVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mbj
    public final void h(mbh mbhVar) {
        this.f.g();
        this.p = mbhVar;
        for (int i = 0; i < b(); i++) {
            mbhVar.c();
        }
    }

    @Override // defpackage.mbj
    public final void i(mbi mbiVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mbj
    public final void j() {
        this.f.g();
        if (!this.i.isEmpty()) {
            lti.c(!this.n);
            this.o = true;
        } else {
            lzp lzpVar = this.u;
            lti.f(lzpVar);
            lzpVar.a();
            this.o = false;
        }
    }
}
