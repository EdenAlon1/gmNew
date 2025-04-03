package androidx.car.app.model;

import defpackage.cfs;
import defpackage.chy;
import defpackage.cjh;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final chy mOnCheckedChangeDelegate;

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public chy getOnCheckedChangeDelegate() {
        chy chyVar = this.mOnCheckedChangeDelegate;
        chyVar.getClass();
        return chyVar;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public String toString() {
        return "[ isChecked: " + this.mIsChecked + ", isEnabled: " + this.mIsEnabled + "]";
    }

    Toggle(cjh cjhVar) {
        boolean z = cjhVar.b;
        this.mIsChecked = false;
        boolean z2 = cjhVar.c;
        this.mIsEnabled = false;
        chy chyVar = cjhVar.a;
        this.mOnCheckedChangeDelegate = null;
    }
}
