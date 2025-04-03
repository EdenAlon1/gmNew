package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qna implements qnl {
    public final String a;
    public int b = 100;
    private final int c;

    public qna(String str, int i) {
        this.a = str;
        this.c = i;
    }

    @Override // defpackage.qnl
    public final int getAppearanceOrder() {
        return this.c;
    }

    @Override // defpackage.qnl
    public final int getPref() {
        return this.b;
    }

    @Override // defpackage.qnl
    public final void setPref(int i) {
        this.b = i;
    }

    @Override // defpackage.qnl
    public final void setIsPrimary(boolean z) {
    }
}
