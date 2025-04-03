package com.google.android.apps.messaging.shared.datamodel.action.common;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bbce;
import defpackage.bbcg;
import defpackage.csjb;
import defpackage.csjc;
import defpackage.cskc;
import defpackage.ctid;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ActionParameters implements Parcelable, bbcg {
    private final Bundle b;
    private static final cskc a = cskc.g("BugleAction", "ActionParameters");
    public static final Parcelable.Creator<ActionParameters> CREATOR = new bbce();

    public ActionParameters() {
        this.b = new Bundle();
    }

    private final synchronized void J() {
        Object obj;
        Parcel obtain = Parcel.obtain();
        String str = null;
        try {
            try {
                obj = null;
                for (String str2 : this.b.keySet()) {
                    try {
                        try {
                            obj = this.b.get(str2);
                            if (obj instanceof Parcelable) {
                                obtain.writeParcelable((Parcelable) obj, 0);
                                obtain.marshall();
                            }
                            str = str2;
                        } catch (RuntimeException e) {
                            e = e;
                            str = str2;
                            csjb b = a.b();
                            b.I("Bundle member isn't marshallable. Cannot be stored in ActionParameters.");
                            b.A(str, obj);
                            b.s(e);
                            throw e;
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                    }
                }
            } catch (RuntimeException e3) {
                e = e3;
                obj = null;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.bbcg
    public final synchronized byte[] A(String str) {
        return this.b.getByteArray(str);
    }

    @Override // defpackage.bbcg
    public final synchronized String[] B(String str) {
        return this.b.getStringArray(str);
    }

    @Override // defpackage.bbcg
    public final synchronized Duration C() {
        return Duration.ofNanos(this.b.getLong("retry_delay", 0L));
    }

    @Override // defpackage.bbcg
    public final synchronized Parcelable[] D() {
        return this.b.getParcelableArray("messages");
    }

    @Override // defpackage.bbcg
    public final synchronized ArrayList E(ArrayList arrayList) {
        ArrayList parcelableArrayList;
        parcelableArrayList = this.b.getParcelableArrayList("rcs.intent.extra.conversationClassifications");
        return parcelableArrayList == null ? arrayList : parcelableArrayList;
    }

    @Override // defpackage.bbcg
    public final synchronized ArrayList F() {
        return this.b.getStringArrayList("message_ids");
    }

    @Override // defpackage.bbcg
    public final synchronized void G(Duration duration) {
        this.b.putLong("retry_delay", duration.toNanos());
    }

    @Override // defpackage.bbcg
    public final synchronized void H(Parcelable[] parcelableArr) {
        this.b.putParcelableArray("messages", parcelableArr);
    }

    @Override // defpackage.bbcg
    public final synchronized void I(ArrayList arrayList) {
        this.b.putStringArrayList("message_ids", arrayList);
    }

    @Override // defpackage.bbcg
    public final synchronized int a(String str) {
        return this.b.getInt(str);
    }

    @Override // defpackage.bbcg
    public final synchronized int b(String str, int i) {
        return this.b.getInt(str, i);
    }

    public final synchronized int c() {
        return this.b.size();
    }

    @Override // defpackage.bbcg
    public final synchronized long d(String str) {
        return this.b.getLong(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.bbcg
    public final synchronized long e(String str, long j) {
        return this.b.getLong(str, j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActionParameters)) {
            return false;
        }
        ActionParameters actionParameters = (ActionParameters) obj;
        if (c() != actionParameters.c()) {
            return false;
        }
        for (String str : actionParameters.o()) {
            if (!Objects.equals(actionParameters.k(str), k(str))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bbcg
    public final synchronized BaseBundle f() {
        return this.b;
    }

    public final synchronized Bundle g() {
        return this.b;
    }

    @Override // defpackage.bbcg
    public final synchronized Parcelable h(String str) {
        return this.b.getParcelable(str);
    }

    public final int hashCode() {
        Iterator it = o().iterator();
        int i = 352654597;
        int i2 = 0;
        int i3 = 352654597;
        while (it.hasNext()) {
            Object k = k((String) it.next());
            int hashCode = k != null ? k.hashCode() : 0;
            if (i2 % 2 == 0) {
                i = (((i << 5) + i) + (i >> 27)) ^ hashCode;
            } else {
                i3 = (((i3 << 5) + i3) + (i3 >> 27)) ^ hashCode;
            }
            i2++;
        }
        return i + (i3 * 1566083941);
    }

    @Override // defpackage.bbcg
    public final Optional j() {
        return Optional.empty();
    }

    public final synchronized Object k(String str) {
        return this.b.get(str);
    }

    @Override // defpackage.bbcg
    public final synchronized String l(String str) {
        return this.b.getString(str);
    }

    @Override // defpackage.bbcg
    public final synchronized ArrayList m(String str) {
        return this.b.getParcelableArrayList(str);
    }

    @Override // defpackage.bbcg
    public final synchronized ArrayList n(String str, Class cls) {
        ArrayList parcelableArrayList;
        if (ctid.h) {
            parcelableArrayList = this.b.getParcelableArrayList(str, cls);
            return parcelableArrayList;
        }
        return this.b.getParcelableArrayList(str);
    }

    public final synchronized Set o() {
        return this.b.keySet();
    }

    @Override // defpackage.bbcg
    public final synchronized void p(String str, boolean z) {
        this.b.putBoolean(str, z);
    }

    @Override // defpackage.bbcg
    public final synchronized void q(String str, byte[] bArr) {
        this.b.putByteArray(str, bArr);
    }

    @Override // defpackage.bbcg
    public final synchronized void r(String str, int i) {
        this.b.putInt(str, i);
    }

    @Override // defpackage.bbcg
    public final synchronized void s(String str, long j) {
        this.b.putLong(str, j);
    }

    @Override // defpackage.bbcg
    public final synchronized void t(String str, Parcelable parcelable) {
        this.b.putParcelable(str, parcelable);
    }

    @Override // defpackage.bbcg
    public final synchronized void u(String str, ArrayList arrayList) {
        this.b.putParcelableArrayList(str, arrayList);
    }

    @Override // defpackage.bbcg
    public final synchronized void v(String str, String str2) {
        this.b.putString(str, str2);
    }

    @Override // defpackage.bbcg
    public final synchronized void w(String str, String[] strArr) {
        this.b.putStringArray(str, strArr);
    }

    @Override // android.os.Parcelable
    public final synchronized void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
    }

    @Override // defpackage.bbcg
    public final synchronized boolean x(String str) {
        return this.b.containsKey(str);
    }

    @Override // defpackage.bbcg
    public final synchronized boolean y(String str) {
        return this.b.getBoolean(str);
    }

    @Override // defpackage.bbcg
    public final synchronized boolean z(String str, boolean z) {
        return this.b.getBoolean(str, z);
    }

    public ActionParameters(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.b = bundle2;
        bundle2.remove("pending_intent");
        if (csjc.c()) {
            J();
        }
    }

    public ActionParameters(Parcel parcel) {
        this.b = parcel.readBundle(ActionParameters.class.getClassLoader());
    }

    @Override // defpackage.bbcg
    public final ActionParameters i() {
        return this;
    }
}
