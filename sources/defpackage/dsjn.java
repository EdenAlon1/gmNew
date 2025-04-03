package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsjn {
    static final /* synthetic */ ffmx[] a;
    public final dqnl b;
    public final dsjk c;
    public final dqlt d;
    public final dsit e;
    public final dqmn f;
    public final ffls g;

    static {
        ffko ffkoVar = new ffko(dsjn.class, "textControl", "getTextControl()Lcom/google/android/libraries/compose/ui/composable/text/HugoDraftTextUiData$TextControl;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dsjn() {
        this((dqnl) null, (dqlt) (0 == true ? 1 : 0), 7);
    }

    public final void a(dsjl dsjlVar) {
        this.g.d(a[0], dsjlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsjn)) {
            return false;
        }
        dsjn dsjnVar = (dsjn) obj;
        return ffkj.e(this.b, dsjnVar.b) && ffkj.e(this.c, dsjnVar.c) && ffkj.e(this.d, dsjnVar.d);
    }

    public final int hashCode() {
        dqnl dqnlVar = this.b;
        int hashCode = dqnlVar == null ? 0 : dqnlVar.hashCode();
        dsjk dsjkVar = this.c;
        int hashCode2 = dsjkVar == null ? 0 : dsjkVar.hashCode();
        int i = hashCode * 31;
        dqlt dqltVar = this.d;
        return ((i + hashCode2) * 31) + (dqltVar != null ? dqltVar.hashCode() : 0);
    }

    public final String toString() {
        return "HugoDraftTextUiData(textChangeListener=" + this.b + ", contentInsertionListener=" + this.c + ", emojiUsageListener=" + this.d + ")";
    }

    public dsjn(dqnl dqnlVar, dsjk dsjkVar, dqlt dqltVar) {
        this.b = dqnlVar;
        this.c = dsjkVar;
        this.d = dqltVar;
        dsit dsitVar = new dsit();
        this.e = dsitVar;
        this.f = dsitVar;
        this.g = new dsjm(this);
    }

    public /* synthetic */ dsjn(dqnl dqnlVar, dqlt dqltVar, int i) {
        this(1 == (i & 1) ? null : dqnlVar, (dsjk) null, (i & 4) != 0 ? null : dqltVar);
    }
}
