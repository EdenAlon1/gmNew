package com.google.android.apps.messaging.shared.datamodel.search.common;

import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.bdgq;
import defpackage.cbmi;
import defpackage.cboy;
import defpackage.cboz;
import defpackage.cbsx;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class SearchQuery {

    /* compiled from: PG */
    public static final class ContentSearchFilter extends SearchFilter {
        public final int a;

        public ContentSearchFilter(int i) {
            this.a = i;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter
        protected final byte a() {
            return (byte) 4;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ContentSearchFilter) && this.a == ((ContentSearchFilter) obj).a;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.a));
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public ContentSearchFilter(Parcel parcel) {
            this.a = parcel.readInt();
        }
    }

    /* compiled from: PG */
    public static final class ConversationListSearchFilter extends SearchFilter {
        public final cbsx a;

        public ConversationListSearchFilter(cbsx cbsxVar) {
            this.a = cbsxVar;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter
        protected final byte a() {
            return (byte) 5;
        }

        public final boolean equals(Object obj) {
            return this == obj;
        }

        public final int hashCode() {
            return Objects.hashCode(this.a);
        }
    }

    /* compiled from: PG */
    public static final class ConversationSearchFilter extends SearchFilter {
        public final ConversationIdType a;

        public ConversationSearchFilter(ConversationIdType conversationIdType) {
            this.a = conversationIdType;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter
        protected final byte a() {
            return (byte) 3;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ConversationSearchFilter) && this.a.equals(((ConversationSearchFilter) obj).a);
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hashCode(this.a);
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a.a());
        }

        public ConversationSearchFilter(Parcel parcel) {
            this.a = bdgq.b(parcel.readString());
        }
    }

    /* compiled from: PG */
    public static final class FreeTextSearchFilter extends SearchFilter {
        public final String a;

        public FreeTextSearchFilter(String str) {
            this.a = str;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter
        protected final byte a() {
            return (byte) 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof FreeTextSearchFilter) && TextUtils.equals(this.a, ((FreeTextSearchFilter) obj).a);
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hashCode(this.a);
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public FreeTextSearchFilter(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            this.a = readString;
        }
    }

    /* compiled from: PG */
    public static final class ParticipantSearchFilter extends SearchFilter {
        public final String a;

        public ParticipantSearchFilter(String str) {
            this.a = str;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter
        protected final byte a() {
            return (byte) 2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ParticipantSearchFilter) && TextUtils.equals(this.a, ((ParticipantSearchFilter) obj).a);
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hashCode(this.a);
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public ParticipantSearchFilter(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            this.a = readString;
        }
    }

    /* compiled from: PG */
    public static abstract class SearchFilter implements Parcelable {
        public static final Parcelable.Creator<SearchFilter> CREATOR = new cboz();

        protected abstract byte a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(a());
        }
    }

    /* compiled from: PG */
    public static final class StarSearchFilter extends SearchFilter {
        @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery.SearchFilter
        protected final byte a() {
            return (byte) 5;
        }

        public final boolean equals(Object obj) {
            return obj instanceof StarSearchFilter;
        }

        public final int hashCode() {
            return 0;
        }
    }

    public static SearchQuery d(List list) {
        cbmi cbmiVar = new cbmi();
        cbmiVar.b(list);
        return cbmiVar.a();
    }

    public abstract CancellationSignal a();

    public abstract cboy b();

    public abstract List c();
}
