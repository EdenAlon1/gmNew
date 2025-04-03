package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dils {
    public String a;
    public Optional b;
    public dilt c;
    public dilw d;
    public Optional e;
    public dilr f;
    public Optional g;
    public List h;
    public Optional i;
    public final String j;
    public dimb k;

    public dils(dils dilsVar) {
        this.b = Optional.empty();
        this.c = dilt.NONE;
        this.d = dilw.UNKNOWN;
        this.e = Optional.empty();
        this.f = dilr.UNKNOWN;
        this.g = Optional.empty();
        this.h = new ArrayList();
        this.i = Optional.empty();
        this.c = dilsVar.c;
        this.f = dilsVar.f;
        this.k = dilsVar.k;
        this.j = dilsVar.j;
    }

    public final void a(dils dilsVar) {
        if (dilsVar.b()) {
            if (dilsVar.k == dimb.FULL) {
                this.i = dilsVar.i;
                this.g = dilsVar.g;
                this.f = dilsVar.f;
                this.a = dilsVar.a;
                this.e = dilsVar.e;
                this.d = dilsVar.d;
                this.h = dilsVar.h;
                this.b = dilsVar.b;
                this.c = dilsVar.c;
                return;
            }
            dimb dimbVar = dilsVar.k;
            if (dimbVar != dimb.PARTIAL) {
                dimb dimbVar2 = dimb.DELETED;
                if (dimbVar == dimbVar2) {
                    this.k = dimbVar2;
                    return;
                }
                return;
            }
            if (dilsVar.i.isPresent()) {
                this.i = dilsVar.i;
            }
            if (dilsVar.g.isPresent()) {
                this.g = dilsVar.g;
            }
            if (dilsVar.f != dilr.UNKNOWN) {
                this.f = dilsVar.f;
            }
            String str = dilsVar.a;
            if (str != null) {
                this.a = str;
            }
            if (dilsVar.e.isPresent()) {
                this.e = dilsVar.e;
            }
            if (dilsVar.d != dilw.UNKNOWN) {
                this.d = dilsVar.d;
            }
            this.h.clear();
            this.h.addAll(dilsVar.h);
            if (dilsVar.b.isPresent()) {
                this.b = dilsVar.b;
            }
            if (dilsVar.c != dilt.NONE) {
                this.c = dilsVar.c;
            }
        }
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.j)) {
            return false;
        }
        if (this.k == dimb.NONE) {
            dkty.q("Invalid endpoint. State is NONE.", new Object[0]);
            return false;
        }
        if (this.k != dimb.FULL || this.c != dilt.NONE) {
            return true;
        }
        dkty.q("Invalid endpoint. Full state does not have a status.", new Object[0]);
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dils)) {
            return false;
        }
        dils dilsVar = (dils) obj;
        return this.i.equals(dilsVar.i) && this.g.equals(dilsVar.g) && this.f == dilsVar.f && TextUtils.equals(this.a, dilsVar.a) && TextUtils.equals(this.j, dilsVar.j) && this.e.equals(dilsVar.e) && this.d == dilsVar.d && this.h.equals(dilsVar.h) && this.b.equals(dilsVar.b) && this.k == dilsVar.k && this.c == dilsVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.i, this.g, this.f, this.a, this.j, this.e, this.d, this.h, this.b, this.k, this.c});
    }

    public final String toString() {
        return "EndPoint [mDisplayText=" + dktx.USER_ID.c(this.a) + ", mReferred=" + String.valueOf(this.b) + ", mStatus=" + String.valueOf(this.c) + ", mJoiningMethod=" + String.valueOf(this.d) + ", mJoiningInfo=" + String.valueOf(this.e) + ", mDisconnectionMethod=" + String.valueOf(this.f) + ", mDisconnectionInfo=" + String.valueOf(this.g) + ", mMedia=" + String.valueOf(this.h) + ", mCallinfo=" + String.valueOf(this.i) + ", mEntity=" + dktx.USER_ID.c(this.j) + ", mState=" + String.valueOf(this.k) + ", mAnyAttr=]";
    }

    public dils(dimb dimbVar, String str) {
        this.b = Optional.empty();
        this.c = dilt.NONE;
        this.d = dilw.UNKNOWN;
        this.e = Optional.empty();
        this.f = dilr.UNKNOWN;
        this.g = Optional.empty();
        this.h = new ArrayList();
        this.i = Optional.empty();
        this.k = dimbVar;
        this.j = str;
    }
}
