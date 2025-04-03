package defpackage;

import android.view.View;
import android.view.Window;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwj implements ljv {
    public final ea a;
    public Window b;
    public int c;
    public boolean d;
    public boolean e;
    private final int f;

    public ddwj(ea eaVar, lkk lkkVar, int i) {
        this.a = eaVar;
        this.f = i;
        lkkVar.c(this);
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        if (this.d) {
            this.b.addFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        } else {
            this.b.clearFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        }
        this.b.setNavigationBarColor(this.c);
        View decorView = this.b.getDecorView();
        if (this.e) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
        }
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        this.b.addFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        this.b.setNavigationBarColor(this.f);
        View decorView = this.b.getDecorView();
        if (this.e) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
