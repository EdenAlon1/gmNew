package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import defpackage.cfs;
import defpackage.cia;
import defpackage.cju;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class ProviderSignInMethod implements cju {
    private final Action mAction;

    private ProviderSignInMethod() {
        this.mAction = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSignInMethod) {
            return Objects.equals(this.mAction, ((ProviderSignInMethod) obj).mAction);
        }
        return false;
    }

    public Action getAction() {
        Action action = this.mAction;
        action.getClass();
        return action;
    }

    public int hashCode() {
        return Objects.hash(this.mAction);
    }

    public String toString() {
        return "[action:" + this.mAction + "]";
    }

    public ProviderSignInMethod(Action action) {
        action.getClass();
        if (action.getType() != 1) {
            throw new IllegalArgumentException("The action must not be a standard action");
        }
        cia onClickDelegate = action.getOnClickDelegate();
        onClickDelegate.getClass();
        if (!onClickDelegate.isParkedOnly()) {
            throw new IllegalArgumentException("The action must use a ParkedOnlyOnClickListener");
        }
        this.mAction = action;
    }
}
