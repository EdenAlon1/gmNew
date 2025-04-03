package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class otp extends lld {
    public final otb a;
    public final ffhd i;
    private final orx j;
    private final osb l;
    private final boolean k = true;
    public final AtomicBoolean h = new AtomicBoolean(true);
    private final AtomicBoolean m = new AtomicBoolean(false);
    private final AtomicBoolean n = new AtomicBoolean(false);

    public otp(otb otbVar, orx orxVar, String[] strArr) {
        this.a = otbVar;
        this.j = orxVar;
        this.l = new otm(strArr, this);
        this.i = otbVar.r() ? otbVar.j() : ffhe.a;
    }

    public abstract Object b();

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c4 A[Catch: all -> 0x002e, Exception -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0031, blocks: (B:12:0x0029, B:16:0x00c4), top: B:11:0x0029, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x0029, B:14:0x00b9, B:16:0x00c4, B:25:0x00e0, B:37:0x00d6, B:38:0x00dd), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b6 -> B:13:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f8 -> B:24:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otp.c(ffgu):java.lang.Object");
    }

    @Override // defpackage.lld
    protected final void h() {
        this.j.b.add(this);
        ffqy.d(this.a.k(), this.i, null, new otn(this, null), 2);
    }

    @Override // defpackage.lld
    protected final void i() {
        this.j.b.remove(this);
    }
}
