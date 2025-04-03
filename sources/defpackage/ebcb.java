package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebcb {
    public final ea a;
    public final ebbb b;
    public final SelectedAccountDisc c;
    public final ebai d;

    public ebcb(ea eaVar, ebbb ebbbVar, SelectedAccountDisc selectedAccountDisc) {
        emxf.b(true, "Activity or Fragment should be non-null but not both");
        this.a = eaVar;
        ebbbVar.getClass();
        this.b = ebbbVar;
        selectedAccountDisc.getClass();
        this.c = selectedAccountDisc;
        this.d = new ebai(selectedAccountDisc, ebbbVar);
    }
}
