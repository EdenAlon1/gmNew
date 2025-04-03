package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myb extends Handler implements Runnable {
    public IOException a;
    public int b;
    final /* synthetic */ myf c;
    private mxz d;
    private Thread e;
    private boolean f;
    private volatile boolean g;
    private final mul h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myb(myf myfVar, Looper looper, mul mulVar, mxz mxzVar) {
        super(looper);
        this.c = myfVar;
        this.h = mulVar;
        this.d = mxzVar;
    }

    private final void c() {
        mtc mtcVar;
        SystemClock.elapsedRealtime();
        mxz mxzVar = this.d;
        lti.f(mxzVar);
        mul mulVar = this.h;
        int i = this.b;
        lxo lxoVar = mulVar.c;
        if (i == 0) {
            long j = mulVar.a;
            mtcVar = new mtc(mulVar.k);
        } else {
            long j2 = mulVar.a;
            lwv lwvVar = mulVar.k;
            mtcVar = new mtc();
        }
        muq muqVar = (muq) mxzVar;
        mtv mtvVar = muqVar.c;
        long j3 = mulVar.j;
        mtvVar.f(mtcVar, new mth(-1, null, lvf.z(j3), lvf.z(muqVar.p)), i);
        this.a = null;
        myf myfVar = this.c;
        myb mybVar = myfVar.c;
        lti.f(mybVar);
        myfVar.e.execute(mybVar);
    }

    private final void d() {
        this.c.c = null;
    }

    public final void a(boolean z) {
        this.g = z;
        this.a = null;
        if (hasMessages(1)) {
            this.f = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.f = true;
                this.h.h = true;
                Thread thread = this.e;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            d();
            SystemClock.elapsedRealtime();
            mxz mxzVar = this.d;
            lti.f(mxzVar);
            mxzVar.z(this.h, true);
            this.d = null;
        }
    }

    public final void b(long j) {
        lti.c(this.c.c == null);
        this.c.c = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, mve, mxz] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long j;
        mya myaVar;
        ndn ndnVar;
        if (this.g) {
            return;
        }
        if (message.what == 1) {
            c();
            return;
        }
        if (message.what == 4) {
            throw ((Error) message.obj);
        }
        d();
        SystemClock.elapsedRealtime();
        ?? r2 = this.d;
        lti.f(r2);
        if (this.f) {
            r2.z(this.h, false);
            return;
        }
        int i = message.what;
        long j2 = 0;
        if (i == 2) {
            try {
                mul mulVar = this.h;
                if (((muq) r2).p == -9223372036854775807L && ((muq) r2).o != null) {
                    long c = ((muq) r2).c(true);
                    if (c != Long.MIN_VALUE) {
                        j2 = c + 10000;
                    }
                    ((muq) r2).p = j2;
                    ((muq) r2).d.a(j2, ((muq) r2).o, ((muq) r2).q);
                }
                lxo lxoVar = mulVar.c;
                long j3 = mulVar.a;
                lwv lwvVar = mulVar.k;
                ((muq) r2).c.d(new mtc(), new mth(-1, null, lvf.z(mulVar.j), lvf.z(((muq) r2).p)));
                ((muq) r2).w = true;
                mti mtiVar = ((muq) r2).k;
                lti.f(mtiVar);
                mtiVar.b(r2);
                return;
            } catch (RuntimeException e) {
                luj.d("LoadTask", "Unexpected exception handling load completed", e);
                this.c.d = new mye(e);
                return;
            }
        }
        if (i != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.a = iOException;
        int i2 = this.b + 1;
        this.b = i2;
        mul mulVar2 = this.h;
        lxo lxoVar2 = mulVar2.c;
        long j4 = mulVar2.a;
        lwv lwvVar2 = mulVar2.k;
        mtc mtcVar = new mtc();
        long j5 = mulVar2.j;
        int i3 = lvf.a;
        long b = mxw.b(new mxx(iOException, i2));
        if (b == -9223372036854775807L) {
            myaVar = myf.b;
            j = -9223372036854775807L;
        } else {
            muq muqVar = (muq) r2;
            j = -9223372036854775807L;
            int b2 = muqVar.b();
            int i4 = b2 > muqVar.v ? 1 : 0;
            if (muqVar.s || !((ndnVar = muqVar.o) == null || ndnVar.w() == -9223372036854775807L)) {
                muqVar.v = b2;
            } else {
                boolean z = muqVar.n;
                if (!z || muqVar.y()) {
                    muqVar.r = z;
                    muqVar.t = 0L;
                    muqVar.v = 0;
                    for (mvb mvbVar : muqVar.m) {
                        mvbVar.k();
                    }
                    mulVar2.b(0L, 0L);
                } else {
                    muqVar.u = true;
                    myaVar = myf.a;
                }
            }
            myaVar = new mya(i4, b);
        }
        int i5 = myaVar.a;
        boolean z2 = i5 == 0 || i5 == 1;
        muq muqVar2 = (muq) r2;
        muqVar2.c.e(mtcVar, new mth(-1, null, lvf.z(mulVar2.j), lvf.z(muqVar2.p)), iOException, !z2);
        if (!z2) {
            long j6 = mulVar2.a;
        }
        int i6 = myaVar.a;
        if (i6 == 3) {
            this.c.d = this.a;
            return;
        }
        if (i6 != 2) {
            if (i6 == 1) {
                this.b = 1;
            }
            long j7 = myaVar.b;
            if (j7 == j) {
                j7 = Math.min((this.b - 1) * 1000, 5000);
            }
            b(j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0219 A[EDGE_INSN: B:109:0x0219->B:90:0x0219 BREAK  A[LOOP:1: B:71:0x01cd->B:82:0x01cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce A[Catch: all -> 0x0238, TryCatch #6 {all -> 0x0238, blocks: (B:32:0x00c4, B:34:0x00ce, B:35:0x00da, B:37:0x00e4, B:38:0x00f0, B:40:0x00fa, B:41:0x0106, B:43:0x0110, B:44:0x0122, B:46:0x012c, B:48:0x0132, B:53:0x015d, B:54:0x0166, B:56:0x0170, B:58:0x0174, B:59:0x0190, B:61:0x01a7, B:64:0x01b0, B:66:0x01b4, B:67:0x01b8, B:69:0x01bc, B:113:0x013c, B:116:0x0149, B:129:0x009f, B:133:0x00ae), top: B:31:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4 A[Catch: all -> 0x0238, TryCatch #6 {all -> 0x0238, blocks: (B:32:0x00c4, B:34:0x00ce, B:35:0x00da, B:37:0x00e4, B:38:0x00f0, B:40:0x00fa, B:41:0x0106, B:43:0x0110, B:44:0x0122, B:46:0x012c, B:48:0x0132, B:53:0x015d, B:54:0x0166, B:56:0x0170, B:58:0x0174, B:59:0x0190, B:61:0x01a7, B:64:0x01b0, B:66:0x01b4, B:67:0x01b8, B:69:0x01bc, B:113:0x013c, B:116:0x0149, B:129:0x009f, B:133:0x00ae), top: B:31:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa A[Catch: all -> 0x0238, TryCatch #6 {all -> 0x0238, blocks: (B:32:0x00c4, B:34:0x00ce, B:35:0x00da, B:37:0x00e4, B:38:0x00f0, B:40:0x00fa, B:41:0x0106, B:43:0x0110, B:44:0x0122, B:46:0x012c, B:48:0x0132, B:53:0x015d, B:54:0x0166, B:56:0x0170, B:58:0x0174, B:59:0x0190, B:61:0x01a7, B:64:0x01b0, B:66:0x01b4, B:67:0x01b8, B:69:0x01bc, B:113:0x013c, B:116:0x0149, B:129:0x009f, B:133:0x00ae), top: B:31:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110 A[Catch: all -> 0x0238, TryCatch #6 {all -> 0x0238, blocks: (B:32:0x00c4, B:34:0x00ce, B:35:0x00da, B:37:0x00e4, B:38:0x00f0, B:40:0x00fa, B:41:0x0106, B:43:0x0110, B:44:0x0122, B:46:0x012c, B:48:0x0132, B:53:0x015d, B:54:0x0166, B:56:0x0170, B:58:0x0174, B:59:0x0190, B:61:0x01a7, B:64:0x01b0, B:66:0x01b4, B:67:0x01b8, B:69:0x01bc, B:113:0x013c, B:116:0x0149, B:129:0x009f, B:133:0x00ae), top: B:31:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c A[Catch: all -> 0x0238, TRY_LEAVE, TryCatch #6 {all -> 0x0238, blocks: (B:32:0x00c4, B:34:0x00ce, B:35:0x00da, B:37:0x00e4, B:38:0x00f0, B:40:0x00fa, B:41:0x0106, B:43:0x0110, B:44:0x0122, B:46:0x012c, B:48:0x0132, B:53:0x015d, B:54:0x0166, B:56:0x0170, B:58:0x0174, B:59:0x0190, B:61:0x01a7, B:64:0x01b0, B:66:0x01b4, B:67:0x01b8, B:69:0x01bc, B:113:0x013c, B:116:0x0149, B:129:0x009f, B:133:0x00ae), top: B:31:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d A[Catch: all -> 0x0238, TryCatch #6 {all -> 0x0238, blocks: (B:32:0x00c4, B:34:0x00ce, B:35:0x00da, B:37:0x00e4, B:38:0x00f0, B:40:0x00fa, B:41:0x0106, B:43:0x0110, B:44:0x0122, B:46:0x012c, B:48:0x0132, B:53:0x015d, B:54:0x0166, B:56:0x0170, B:58:0x0174, B:59:0x0190, B:61:0x01a7, B:64:0x01b0, B:66:0x01b4, B:67:0x01b8, B:69:0x01bc, B:113:0x013c, B:116:0x0149, B:129:0x009f, B:133:0x00ae), top: B:31:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170 A[Catch: all -> 0x0238, TryCatch #6 {all -> 0x0238, blocks: (B:32:0x00c4, B:34:0x00ce, B:35:0x00da, B:37:0x00e4, B:38:0x00f0, B:40:0x00fa, B:41:0x0106, B:43:0x0110, B:44:0x0122, B:46:0x012c, B:48:0x0132, B:53:0x015d, B:54:0x0166, B:56:0x0170, B:58:0x0174, B:59:0x0190, B:61:0x01a7, B:64:0x01b0, B:66:0x01b4, B:67:0x01b8, B:69:0x01bc, B:113:0x013c, B:116:0x0149, B:129:0x009f, B:133:0x00ae), top: B:31:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7 A[Catch: all -> 0x0238, TryCatch #6 {all -> 0x0238, blocks: (B:32:0x00c4, B:34:0x00ce, B:35:0x00da, B:37:0x00e4, B:38:0x00f0, B:40:0x00fa, B:41:0x0106, B:43:0x0110, B:44:0x0122, B:46:0x012c, B:48:0x0132, B:53:0x015d, B:54:0x0166, B:56:0x0170, B:58:0x0174, B:59:0x0190, B:61:0x01a7, B:64:0x01b0, B:66:0x01b4, B:67:0x01b8, B:69:0x01bc, B:113:0x013c, B:116:0x0149, B:129:0x009f, B:133:0x00ae), top: B:31:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc A[Catch: all -> 0x0238, TRY_LEAVE, TryCatch #6 {all -> 0x0238, blocks: (B:32:0x00c4, B:34:0x00ce, B:35:0x00da, B:37:0x00e4, B:38:0x00f0, B:40:0x00fa, B:41:0x0106, B:43:0x0110, B:44:0x0122, B:46:0x012c, B:48:0x0132, B:53:0x015d, B:54:0x0166, B:56:0x0170, B:58:0x0174, B:59:0x0190, B:61:0x01a7, B:64:0x01b0, B:66:0x01b4, B:67:0x01b8, B:69:0x01bc, B:113:0x013c, B:116:0x0149, B:129:0x009f, B:133:0x00ae), top: B:31:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c A[Catch: all -> 0x025b, TRY_ENTER, TryCatch #10 {all -> 0x025b, blocks: (B:11:0x002b, B:12:0x002d, B:138:0x004b, B:140:0x0055, B:141:0x005d, B:91:0x021c, B:93:0x0226, B:95:0x022f, B:103:0x023f, B:105:0x0249, B:106:0x0251, B:107:0x0256), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236 A[LOOP:0: B:12:0x002d->B:97:0x0236, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0257 A[EDGE_INSN: B:98:0x0257->B:99:0x0257 BREAK  A[LOOP:0: B:12:0x002d->B:97:0x0236], SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myb.run():void");
    }
}
