package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdix implements bdiz {
    public final ComposeRowState a;

    public bdix(ComposeRowState composeRowState) {
        this.a = composeRowState;
    }

    @Override // defpackage.bdiz
    public final /* synthetic */ Object a(ffji ffjiVar, ffji ffjiVar2) {
        return bdiy.a(this, ffjiVar, ffjiVar2);
    }

    @Override // defpackage.bdiz
    public final /* synthetic */ boolean b() {
        return bdiy.b(this);
    }

    @Override // defpackage.bdiz
    public final boolean c() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdix) && ffkj.e(this.a, ((bdix) obj).a);
    }

    public final int hashCode() {
        ComposeRowState composeRowState = this.a;
        if (composeRowState == null) {
            return 0;
        }
        return composeRowState.hashCode();
    }

    public final String toString() {
        return "NullableComposeRowState(composeRowState=" + this.a + ")";
    }
}
