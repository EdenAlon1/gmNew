package com.google.android.apps.messaging.ui.search.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import defpackage.ddpr;
import defpackage.ddqg;
import defpackage.ddqh;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class SearchFilterDataItem implements Parcelable, ddpr {
    public static final Parcelable.Creator<SearchFilterDataItem> CREATOR = new ddqg();
    private final String a;
    protected final SearchQuery.SearchFilter b;
    public final boolean c;
    private final String d;

    /* compiled from: PG */
    public interface a {
        ddqh dg();
    }

    public SearchFilterDataItem(SearchQuery.SearchFilter searchFilter, String str, String str2) {
        this.b = searchFilter;
        this.a = str;
        this.d = str2;
        this.c = false;
    }

    public SearchQuery.SearchFilter a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SearchFilterDataItem) && this.b.equals(((SearchFilterDataItem) obj).b);
        }
        return true;
    }

    public String f() {
        return this.d;
    }

    public int hashCode() {
        return Objects.hash(this.b, this.a, this.d);
    }

    public String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public SearchFilterDataItem(SearchQuery.SearchFilter searchFilter, String str, String str2, boolean z) {
        this.b = searchFilter;
        this.a = str;
        this.d = str2;
        this.c = z;
    }
}
