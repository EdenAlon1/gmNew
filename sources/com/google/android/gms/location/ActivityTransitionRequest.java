package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgye;
import defpackage.dgyf;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new dgyf();
    public static final Comparator a = new dgye();
    public final List b;
    public final String c;
    public final List d;
    public String e;

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        dfwv.o(list, "transitions can't be null");
        dfwv.b(!list.isEmpty(), "transitions can't be empty.");
        dfwv.n(list);
        TreeSet treeSet = new TreeSet(a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            dfwv.b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = str;
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (dfwq.a(this.b, activityTransitionRequest.b) && dfwq.a(this.c, activityTransitionRequest.c) && dfwq.a(this.e, activityTransitionRequest.e) && dfwq.a(this.d, activityTransitionRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        List list = this.d;
        return "ActivityTransitionRequest [mTransitions=" + String.valueOf(this.b) + ", mTag='" + this.c + "', mClients=" + String.valueOf(list) + ", mAttributionTag=" + this.e + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dfwv.n(parcel);
        List list = this.b;
        int a2 = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.m(parcel, 2, this.c, false);
        dfxk.n(parcel, 3, this.d, false);
        dfxk.m(parcel, 4, this.e, false);
        dfxk.c(parcel, a2);
    }
}
