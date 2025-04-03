package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eg extends abe implements klf {
    boolean c;
    boolean d;
    final el a = new el(new ef(this));
    final lkv b = new lkv(this);
    boolean e = true;

    public eg() {
        U().b("android:support:lifecycle", new owu() { // from class: eb
            @Override // defpackage.owu
            public final Bundle a() {
                eg egVar = eg.this;
                egVar.hu();
                egVar.b.e(lki.ON_STOP);
                return new Bundle();
            }
        });
        hv(new ksp() { // from class: ec
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                eg.this.a.b();
            }
        });
        this.j.add(new ksp() { // from class: ed
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                eg.this.a.b();
            }
        });
        y(new adc() { // from class: ee
            @Override // defpackage.adc
            public final void a() {
                en enVar = eg.this.a.a;
                enVar.e.t(enVar, enVar, null);
            }
        });
    }

    private static boolean fc(fr frVar, lkj lkjVar) {
        boolean z = false;
        for (ea eaVar : frVar.p()) {
            if (eaVar != null) {
                if (eaVar.X() != null) {
                    z |= fc(eaVar.I(), lkjVar);
                }
                gq gqVar = eaVar.aa;
                if (gqVar != null && ((lkv) gqVar.P()).c.a(lkj.STARTED)) {
                    eaVar.aa.a.f(lkjVar);
                    z = true;
                }
                if (eaVar.Z.c.a(lkj.STARTED)) {
                    eaVar.Z.f(lkjVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final fr a() {
        return this.a.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0.equals("--list-dumpables") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L32;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            super.dump(r3, r4, r5, r6)
            if (r6 == 0) goto L54
            int r0 = r6.length
            if (r0 != 0) goto L9
            goto L54
        L9:
            r0 = 0
            r0 = r6[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L45;
                case 100470631: goto L35;
                case 472614934: goto L2c;
                case 1159329357: goto L1d;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L54
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L53
            goto L54
        L1d:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L54
            goto L53
        L2c:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            goto L3e
        L35:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L54
        L3e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L54
            goto L53
        L45:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L54
        L53:
            return
        L54:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "  "
            java.lang.String r0 = r0.concat(r1)
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.c
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.d
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.e
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto La4
            loo r1 = defpackage.loo.a(r2)
            r1.d(r0, r5)
        La4:
            el r0 = r2.a
            fr r0 = r0.a()
            r0.L(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    final View ht(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.a.e.d.onCreateView(view, str, context, attributeSet);
    }

    final void hu() {
        while (fc(a(), lkj.CREATED)) {
        }
    }

    @Override // defpackage.abe, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.a.b();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.e(lki.ON_CREATE);
        this.a.a.e.y();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View ht = ht(view, str, context, attributeSet);
        return ht == null ? super.onCreateView(view, str, context, attributeSet) : ht;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.a.a.e.z();
        this.b.e(lki.ON_DESTROY);
    }

    @Override // defpackage.abe, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.a.a.e.ab(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.d = false;
        this.a.a.e.F();
        this.b.e(lki.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.b.e(lki.ON_RESUME);
        this.a.a.e.H();
    }

    @Override // defpackage.abe, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.a.b();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.a.b();
        super.onResume();
        this.d = true;
        this.a.c();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.a.b();
        super.onStart();
        this.e = false;
        if (!this.c) {
            this.c = true;
            this.a.a.e.w();
        }
        this.a.c();
        this.b.e(lki.ON_START);
        this.a.a.e.I();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.a.b();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.e = true;
        hu();
        this.a.a.e.K();
        this.b.e(lki.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View ht = ht(null, str, context, attributeSet);
        return ht == null ? super.onCreateView(str, context, attributeSet) : ht;
    }

    @Deprecated
    public void h(ea eaVar) {
    }
}
