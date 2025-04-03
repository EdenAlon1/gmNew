package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekoo<T> extends BroadcastReceiver implements ekoh {
    public static final enru a = enru.c("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver");
    public dlpw b;
    public long c;
    public errm d;
    private final Class e;
    private ffbr f;

    /* compiled from: PG */
    public interface a {
        dlpw dF();

        ekxa eE();

        errm eV();

        ffbr gA();

        void jb();

        void jc();
    }

    protected ekoo(Class cls) {
        this.e = cls;
    }

    protected ekoq a(Object obj) {
        throw null;
    }

    @Override // defpackage.ekoh
    public final /* synthetic */ long b() {
        return -1L;
    }

    @Override // defpackage.ekoh
    public final /* synthetic */ long c() {
        return -1L;
    }

    protected abstract ListenableFuture d(Context context, Class cls);

    /* JADX WARN: Code restructure failed: missing block: B:60:0x018c, code lost:
    
        r0 = r11.getPackageManager();
        r7 = defpackage.eepp.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0192, code lost:
    
        monitor-enter(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0195, code lost:
    
        if (defpackage.eepp.b != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0197, code lost:
    
        r8 = new android.content.Intent();
        r8.setPackage(r11.getPackageName());
        defpackage.eepp.b = r0.queryBroadcastReceivers(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a9, code lost:
    
        r0 = defpackage.eepp.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ab, code lost:
    
        monitor-exit(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ac, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b4, code lost:
    
        if (r0.hasNext() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c4, code lost:
    
        if (r4.equals(((android.content.pm.ResolveInfo) r0.next()).activityInfo.name) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cc, code lost:
    
        throw new defpackage.eepo(r12);
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r11, final android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekoo.onReceive(android.content.Context, android.content.Intent):void");
    }
}
