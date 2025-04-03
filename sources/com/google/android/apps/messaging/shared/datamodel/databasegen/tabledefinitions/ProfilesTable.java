package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import defpackage.aqgx;
import defpackage.bwlr;
import defpackage.bwlt;
import defpackage.bwlu;
import defpackage.bwnk;
import defpackage.bwnl;
import defpackage.bwnm;
import defpackage.bwoh;
import defpackage.bwom;
import defpackage.bwon;
import defpackage.bwoq;
import defpackage.bwor;
import defpackage.cjwo;
import defpackage.dtro;
import defpackage.dtrq;
import defpackage.dtsq;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtum;
import defpackage.dtun;
import defpackage.dtuo;
import defpackage.dtup;
import defpackage.dtve;
import defpackage.dtzf;
import defpackage.ekhw;
import defpackage.emyl;
import defpackage.engr;
import defpackage.engw;
import defpackage.enhd;
import defpackage.enhk;
import defpackage.eyfc;
import defpackage.eyfy;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ProfilesTable extends dtup {
    public static final String[] a = {"profiles_table._id", "profiles_table.participant_id", "profiles_table.person_id", "profiles_table.profile_access_token", "profiles_table.sending_self_profile_interaction_state", "profiles_table.self_profile_sharing_metadata", "profiles_table.first_name", "profiles_table.last_name", "profiles_table.display_name", "profiles_table.photo_uri", "profiles_table.sender_last_updated_time", "profiles_table.sender_last_updated_time_from_rcs", "profiles_table.contact_lookup_key", "profiles_table.phone_number", "profiles_table.is_self_profile_shareable", "profiles_table.has_shared_access_token_with_user", "profiles_table.name_timestamp", "profiles_table.photo_timestamp", "profiles_table.belongs_to_self_gaia", "profiles_table.gaia_update_timestamp"};
    public static final enhk b;
    public static final bwnk c;
    public static final int[] d;

    /* compiled from: PG */
    public static abstract class BindData extends dtro<bwnm, bwom, bwon, BindData, bwnl> implements Parcelable, dtrq {
        public static final Parcelable.Creator<BindData> CREATOR = new bwlr();
        public long a;
        public long b;
        public String c;
        public String d;
        public cjwo f;
        public String g;
        public String h;
        public String i;
        public Uri j;
        public String k;
        public String l;
        public String m;
        public String n;
        public aqgx e = aqgx.a;
        public boolean o = true;
        public boolean p = false;
        public long q = 0;
        public long r = 0;
        public boolean s = false;
        public long t = 0;

        protected BindData() {
        }

        public final String A() {
            az(3, "profile_access_token");
            return this.d;
        }

        public final String B() {
            az(10, "sender_last_updated_time");
            return this.k;
        }

        public final String C() {
            az(11, "sender_last_updated_time_from_rcs");
            return this.l;
        }

        public final boolean D() {
            az(18, "belongs_to_self_gaia");
            return this.s;
        }

        public final boolean E() {
            az(15, "has_shared_access_token_with_user");
            return this.p;
        }

        public final boolean F() {
            az(14, "is_self_profile_shareable");
            return this.o;
        }

        public final boolean G(final bwoq bwoqVar) {
            final dtve b = ProfilesTable.b();
            return ((Boolean) b.q(new emyl() { // from class: bwln
                @Override // defpackage.emyl
                public final Object get() {
                    String[] strArr = ProfilesTable.a;
                    bwop bwopVar = new bwop();
                    ContentValues contentValues = bwopVar.a;
                    final ProfilesTable.BindData bindData = ProfilesTable.BindData.this;
                    dtub.t(contentValues, "participant_id", bindData.n());
                    bwopVar.c(bindData.y());
                    bwopVar.d(bindData.A());
                    aqgx r = bindData.r();
                    int intValue = ProfilesTable.c().intValue();
                    int intValue2 = ProfilesTable.c().intValue();
                    if (intValue2 < 60200) {
                        dtub.w("sending_self_profile_interaction_state", intValue2);
                    }
                    if (intValue >= 60200) {
                        if (r == null) {
                            bwopVar.a.putNull("sending_self_profile_interaction_state");
                        } else {
                            bwopVar.a.put("sending_self_profile_interaction_state", Integer.valueOf(r.ordinal()));
                        }
                    }
                    cjwo t = bindData.t();
                    int intValue3 = ProfilesTable.c().intValue();
                    int intValue4 = ProfilesTable.c().intValue();
                    if (intValue4 < 60340) {
                        dtub.w("self_profile_sharing_metadata", intValue4);
                    }
                    if (intValue3 >= 60340) {
                        if (t == null) {
                            bwopVar.a.putNull("self_profile_sharing_metadata");
                        } else {
                            bwopVar.a.put("self_profile_sharing_metadata", t.toByteArray());
                        }
                    }
                    dtub.u(bwopVar.a, "first_name", bindData.w());
                    dtub.u(bwopVar.a, "last_name", bindData.x());
                    dtub.u(bwopVar.a, "display_name", bindData.v());
                    Uri q = bindData.q();
                    if (q == null) {
                        bwopVar.a.putNull("photo_uri");
                    } else {
                        bwopVar.a.put("photo_uri", q.toString());
                    }
                    bwopVar.e(bindData.B());
                    bwopVar.f(bindData.C());
                    dtub.u(bwopVar.a, "contact_lookup_key", bindData.u());
                    dtub.u(bwopVar.a, "phone_number", bindData.z());
                    boolean F = bindData.F();
                    int intValue5 = ProfilesTable.c().intValue();
                    int intValue6 = ProfilesTable.c().intValue();
                    if (intValue6 < 60400) {
                        dtub.w("is_self_profile_shareable", intValue6);
                    }
                    if (intValue5 >= 60400) {
                        bwopVar.a.put("is_self_profile_shareable", Boolean.valueOf(F));
                    }
                    boolean E = bindData.E();
                    int intValue7 = ProfilesTable.c().intValue();
                    int intValue8 = ProfilesTable.c().intValue();
                    if (intValue8 < 60170) {
                        dtub.w("has_shared_access_token_with_user", intValue8);
                    }
                    if (intValue7 >= 60170) {
                        bwopVar.a.put("has_shared_access_token_with_user", Boolean.valueOf(E));
                    }
                    bwopVar.a.put("name_timestamp", Long.valueOf(bindData.m()));
                    bwopVar.a.put("photo_timestamp", Long.valueOf(bindData.o()));
                    boolean D = bindData.D();
                    int intValue9 = ProfilesTable.c().intValue();
                    int intValue10 = ProfilesTable.c().intValue();
                    if (intValue10 < 59940) {
                        dtub.w("belongs_to_self_gaia", intValue10);
                    }
                    if (intValue9 >= 59940) {
                        bwopVar.a.put("belongs_to_self_gaia", Boolean.valueOf(D));
                    }
                    long k = bindData.k();
                    int intValue11 = ProfilesTable.c().intValue();
                    int intValue12 = ProfilesTable.c().intValue();
                    if (intValue12 < 59940) {
                        dtub.w("gaia_update_timestamp", intValue12);
                    }
                    if (intValue11 >= 59940) {
                        bwopVar.a.put("gaia_update_timestamp", Long.valueOf(k));
                    }
                    bwoq bwoqVar2 = bwoqVar;
                    bwopVar.al();
                    bwopVar.af(bwoqVar2);
                    bwopVar.an(new dtui("profiles_table", "-updateOrInsert-update"));
                    if (bwopVar.a().e() != 0) {
                        return true;
                    }
                    final dtve dtveVar = b;
                    return Boolean.valueOf(dtub.b(ProfilesTable.b(), "profiles_table", bindData, new Function() { // from class: bwlo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dtve.this.R("profiles_table", (ContentValues) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bwlp
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            Long l = (Long) obj;
                            if (l.longValue() >= 0) {
                                ProfilesTable.BindData bindData2 = ProfilesTable.BindData.this;
                                bindData2.a = new bwlq(l).a.longValue();
                                bindData2.fY(0);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }) != -1);
                }
            })).booleanValue();
        }

        public final boolean H(Function function) {
            Object apply;
            String[] strArr = ProfilesTable.a;
            apply = function.apply(new bwor());
            return G(new bwoq((bwor) apply));
        }

        @Override // defpackage.dtro
        public final String a() {
            return String.format(Locale.US, "ProfilesTable [_id: %s,\n  participant_id: %s,\n  person_id: %s,\n  profile_access_token: %s,\n  sending_self_profile_interaction_state: %s,\n  self_profile_sharing_metadata: %s,\n  first_name: %s,\n  last_name: %s,\n  display_name: %s,\n  photo_uri: %s,\n  sender_last_updated_time: %s,\n  sender_last_updated_time_from_rcs: %s,\n  contact_lookup_key: %s,\n  phone_number: %s,\n  is_self_profile_shareable: %s,\n  has_shared_access_token_with_user: %s,\n  name_timestamp: %s,\n  photo_timestamp: %s,\n  belongs_to_self_gaia: %s,\n  gaia_update_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t));
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            int intValue = ProfilesTable.c().intValue();
            dtub.t(contentValues, "participant_id", this.b);
            if (intValue >= 60170) {
                dtub.u(contentValues, "person_id", this.c);
            }
            if (intValue >= 60170) {
                dtub.u(contentValues, "profile_access_token", this.d);
            }
            if (intValue >= 60200) {
                aqgx aqgxVar = this.e;
                if (aqgxVar == null) {
                    contentValues.putNull("sending_self_profile_interaction_state");
                } else {
                    contentValues.put("sending_self_profile_interaction_state", Integer.valueOf(aqgxVar.ordinal()));
                }
            }
            if (intValue >= 60340) {
                cjwo cjwoVar = this.f;
                if (cjwoVar == null) {
                    contentValues.putNull("self_profile_sharing_metadata");
                } else {
                    contentValues.put("self_profile_sharing_metadata", cjwoVar.toByteArray());
                }
            }
            dtub.u(contentValues, "first_name", this.g);
            dtub.u(contentValues, "last_name", this.h);
            dtub.u(contentValues, "display_name", this.i);
            Uri uri = this.j;
            if (uri == null) {
                contentValues.putNull("photo_uri");
            } else {
                contentValues.put("photo_uri", uri.toString());
            }
            if (intValue >= 60170) {
                dtub.u(contentValues, "sender_last_updated_time", this.k);
            }
            if (intValue >= 60200) {
                dtub.u(contentValues, "sender_last_updated_time_from_rcs", this.l);
            }
            dtub.u(contentValues, "contact_lookup_key", this.m);
            dtub.u(contentValues, "phone_number", this.n);
            if (intValue >= 60400) {
                contentValues.put("is_self_profile_shareable", Boolean.valueOf(this.o));
            }
            if (intValue >= 60170) {
                contentValues.put("has_shared_access_token_with_user", Boolean.valueOf(this.p));
            }
            contentValues.put("name_timestamp", Long.valueOf(this.q));
            contentValues.put("photo_timestamp", Long.valueOf(this.r));
            if (intValue >= 59940) {
                contentValues.put("belongs_to_self_gaia", Boolean.valueOf(this.s));
            }
            if (intValue >= 59940) {
                contentValues.put("gaia_update_timestamp", Long.valueOf(this.t));
            }
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            bwoh bwohVar = (bwoh) ((bwnm) dtsuVar);
            aB();
            this.cL = bwohVar.cU();
            if (bwohVar.di(0)) {
                this.a = bwohVar.f();
                fY(0);
            }
            if (bwohVar.di(1)) {
                this.b = bwohVar.h();
                fY(1);
            }
            if (bwohVar.di(2)) {
                this.c = bwohVar.q();
                fY(2);
            }
            if (bwohVar.di(3)) {
                this.d = bwohVar.s();
                fY(3);
            }
            if (bwohVar.di(4)) {
                this.e = bwohVar.k();
                fY(4);
            }
            if (bwohVar.di(5)) {
                this.f = bwohVar.l();
                fY(5);
            }
            if (bwohVar.di(6)) {
                this.g = bwohVar.o();
                fY(6);
            }
            if (bwohVar.di(7)) {
                this.h = bwohVar.p();
                fY(7);
            }
            if (bwohVar.di(8)) {
                this.i = bwohVar.n();
                fY(8);
            }
            if (bwohVar.di(9)) {
                this.j = bwohVar.j();
                fY(9);
            }
            if (bwohVar.di(10)) {
                this.k = bwohVar.t();
                fY(10);
            }
            if (bwohVar.di(11)) {
                this.l = bwohVar.u();
                fY(11);
            }
            if (bwohVar.di(12)) {
                this.m = bwohVar.m();
                fY(12);
            }
            if (bwohVar.di(13)) {
                this.n = bwohVar.r();
                fY(13);
            }
            if (bwohVar.di(14)) {
                this.o = bwohVar.x();
                fY(14);
            }
            if (bwohVar.di(15)) {
                this.p = bwohVar.w();
                fY(15);
            }
            if (bwohVar.di(16)) {
                this.q = bwohVar.g();
                fY(16);
            }
            if (bwohVar.di(17)) {
                this.r = bwohVar.i();
                fY(17);
            }
            if (bwohVar.di(18)) {
                this.s = bwohVar.v();
                fY(18);
            }
            if (bwohVar.di(19)) {
                this.t = bwohVar.e();
                fY(19);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData bindData = (BindData) obj;
            return super.aD(bindData.cL) && this.a == bindData.a && this.b == bindData.b && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && this.e == bindData.e && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && Objects.equals(this.j, bindData.j) && Objects.equals(this.k, bindData.k) && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && Objects.equals(this.n, bindData.n) && this.o == bindData.o && this.p == bindData.p && this.q == bindData.q && this.r == bindData.r && this.s == bindData.s && this.t == bindData.t;
        }

        @Override // defpackage.dtrq
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "profiles_table", dtub.m(new String[]{"participant_id", "person_id", "profile_access_token", "sending_self_profile_interaction_state", "self_profile_sharing_metadata", "first_name", "last_name", "display_name", "photo_uri", "sender_last_updated_time", "sender_last_updated_time_from_rcs", "contact_lookup_key", "phone_number", "is_self_profile_shareable", "has_shared_access_token_with_user", "name_timestamp", "photo_timestamp", "belongs_to_self_gaia", "gaia_update_timestamp"}));
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            cjwo cjwoVar;
            this.a = parcel.readLong();
            this.b = parcel.readLong();
            this.c = parcel.readString();
            this.d = parcel.readString();
            aqgx[] values = aqgx.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt >= values.length) {
                    throw new IllegalArgumentException();
                }
                this.e = values[readInt];
            }
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                cjwoVar = null;
            } else {
                try {
                    cjwoVar = (cjwo) eyfy.parseFrom(cjwo.a, createByteArray, eyfc.a());
                } catch (Throwable unused) {
                    this.f = null;
                }
            }
            this.f = cjwoVar;
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            String readString = parcel.readString();
            this.j = readString != null ? Uri.parse(readString) : null;
            this.k = parcel.readString();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readString();
            this.o = parcel.readInt() == 1;
            this.p = parcel.readInt() == 1;
            this.q = parcel.readLong();
            this.r = parcel.readLong();
            this.s = parcel.readInt() == 1;
            this.t = parcel.readLong();
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            aqgx aqgxVar = this.e;
            parcel.writeInt(aqgxVar == null ? -1 : aqgxVar.ordinal());
            cjwo cjwoVar = this.f;
            parcel.writeByteArray(cjwoVar == null ? null : cjwoVar.toByteArray());
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            Uri uri = this.j;
            parcel.writeString(uri != null ? uri.toString() : null);
            parcel.writeString(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeString(this.n);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeInt(this.p ? 1 : 0);
            parcel.writeLong(this.q);
            parcel.writeLong(this.r);
            parcel.writeInt(this.s ? 1 : 0);
            parcel.writeLong(this.t);
        }

        @Override // defpackage.dtrq
        public final String g() {
            return "_id";
        }

        @Override // defpackage.dtrq
        public final String h() {
            return "profiles_table";
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
            Long valueOf = Long.valueOf(this.a);
            Long valueOf2 = Long.valueOf(this.b);
            String str = this.c;
            String str2 = this.d;
            aqgx aqgxVar = this.e;
            return Objects.hash(dtsqVar2, valueOf, valueOf2, str, str2, Integer.valueOf(aqgxVar == null ? 0 : aqgxVar.ordinal()), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, Boolean.valueOf(this.o), Boolean.valueOf(this.p), Long.valueOf(this.q), Long.valueOf(this.r), Boolean.valueOf(this.s), Long.valueOf(this.t), null);
        }

        @Override // defpackage.dtrq
        public final void i(StringBuilder sb, List list) {
            Long valueOf = Long.valueOf(this.b);
            String str = this.c;
            String str2 = this.d;
            aqgx aqgxVar = this.e;
            Object valueOf2 = aqgxVar == null ? 0 : String.valueOf(aqgxVar.ordinal());
            cjwo cjwoVar = this.f;
            byte[] byteArray = cjwoVar == null ? null : cjwoVar.toByteArray();
            String str3 = this.g;
            String str4 = this.h;
            String str5 = this.i;
            Uri uri = this.j;
            Object[] objArr = {valueOf, str, str2, valueOf2, byteArray, str3, str4, str5, uri != null ? uri.toString() : null, this.k, this.l, this.m, this.n, Integer.valueOf(this.o ? 1 : 0), Integer.valueOf(this.p ? 1 : 0), Long.valueOf(this.q), Long.valueOf(this.r), Integer.valueOf(this.s ? 1 : 0), Long.valueOf(this.t)};
            sb.append('(');
            for (int i = 0; i < 19; i++) {
                Object obj = objArr[i];
                if (obj instanceof Number) {
                    sb.append(String.valueOf(obj));
                } else {
                    if (obj instanceof String) {
                        String str6 = (String) obj;
                        if (str6.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str6));
                        }
                    }
                    list.add(obj);
                    sb.append('?');
                    sb.append(',');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        @Override // defpackage.dtrq
        @Deprecated
        public final /* bridge */ /* synthetic */ Object j() {
            throw null;
        }

        public final long k() {
            az(19, "gaia_update_timestamp");
            return this.t;
        }

        public final long l() {
            az(0, "_id");
            return this.a;
        }

        public final long m() {
            az(16, "name_timestamp");
            return this.q;
        }

        public final long n() {
            az(1, "participant_id");
            return this.b;
        }

        public final long o() {
            az(17, "photo_timestamp");
            return this.r;
        }

        public final Uri q() {
            az(9, "photo_uri");
            return this.j;
        }

        public final aqgx r() {
            az(4, "sending_self_profile_interaction_state");
            return this.e;
        }

        public final bwlt s() {
            bwlu bwluVar = new bwlu();
            BitSet bitSet = this.cJ;
            bwluVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
            BitSet bitSet2 = bwluVar.az;
            if (bitSet2 == null || bitSet2.get(0)) {
                bwluVar.a = l();
            }
            BitSet bitSet3 = bwluVar.az;
            if (bitSet3 == null || bitSet3.get(1)) {
                bwluVar.b = n();
            }
            BitSet bitSet4 = bwluVar.az;
            if (bitSet4 == null || bitSet4.get(2)) {
                bwluVar.c = y();
            }
            BitSet bitSet5 = bwluVar.az;
            if (bitSet5 == null || bitSet5.get(3)) {
                bwluVar.d = A();
            }
            BitSet bitSet6 = bwluVar.az;
            if (bitSet6 == null || bitSet6.get(4)) {
                bwluVar.e = r();
            }
            BitSet bitSet7 = bwluVar.az;
            if (bitSet7 == null || bitSet7.get(5)) {
                bwluVar.f = t();
            }
            BitSet bitSet8 = bwluVar.az;
            if (bitSet8 == null || bitSet8.get(6)) {
                bwluVar.g = w();
            }
            BitSet bitSet9 = bwluVar.az;
            if (bitSet9 == null || bitSet9.get(7)) {
                bwluVar.h = x();
            }
            BitSet bitSet10 = bwluVar.az;
            if (bitSet10 == null || bitSet10.get(8)) {
                bwluVar.i = v();
            }
            BitSet bitSet11 = bwluVar.az;
            if (bitSet11 == null || bitSet11.get(9)) {
                bwluVar.j = q();
            }
            BitSet bitSet12 = bwluVar.az;
            if (bitSet12 == null || bitSet12.get(10)) {
                bwluVar.k = B();
            }
            BitSet bitSet13 = bwluVar.az;
            if (bitSet13 == null || bitSet13.get(11)) {
                bwluVar.l = C();
            }
            BitSet bitSet14 = bwluVar.az;
            if (bitSet14 == null || bitSet14.get(12)) {
                bwluVar.m = u();
            }
            BitSet bitSet15 = bwluVar.az;
            if (bitSet15 == null || bitSet15.get(13)) {
                bwluVar.n = z();
            }
            BitSet bitSet16 = bwluVar.az;
            if (bitSet16 == null || bitSet16.get(14)) {
                bwluVar.o = F();
            }
            BitSet bitSet17 = bwluVar.az;
            if (bitSet17 == null || bitSet17.get(15)) {
                bwluVar.p = E();
            }
            BitSet bitSet18 = bwluVar.az;
            if (bitSet18 == null || bitSet18.get(16)) {
                bwluVar.q = m();
            }
            BitSet bitSet19 = bwluVar.az;
            if (bitSet19 == null || bitSet19.get(17)) {
                bwluVar.r = o();
            }
            BitSet bitSet20 = bwluVar.az;
            if (bitSet20 == null || bitSet20.get(18)) {
                bwluVar.s = D();
            }
            BitSet bitSet21 = bwluVar.az;
            if (bitSet21 != null && !bitSet21.get(19)) {
                return bwluVar;
            }
            bwluVar.t = k();
            return bwluVar;
        }

        public final cjwo t() {
            az(5, "self_profile_sharing_metadata");
            return this.f;
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ProfilesTable -- REDACTED") : a();
        }

        public final String u() {
            az(12, "contact_lookup_key");
            return this.m;
        }

        public final String v() {
            az(8, "display_name");
            return this.i;
        }

        public final String w() {
            az(6, "first_name");
            return this.g;
        }

        public final String x() {
            az(7, "last_name");
            return this.h;
        }

        public final String y() {
            az(2, "person_id");
            return this.c;
        }

        public final String z() {
            az(13, "phone_number");
            return this.n;
        }

        protected BindData(Parcel parcel) {
            aA(parcel);
        }
    }

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("profiles_table.person_id", 60170);
        enhdVar.k("profiles_table.profile_access_token", 60170);
        enhdVar.k("profiles_table.sending_self_profile_interaction_state", 60200);
        enhdVar.k("profiles_table.self_profile_sharing_metadata", 60340);
        enhdVar.k("profiles_table.sender_last_updated_time", 60170);
        enhdVar.k("profiles_table.sender_last_updated_time_from_rcs", 60200);
        enhdVar.k("profiles_table.is_self_profile_shareable", 60400);
        enhdVar.k("profiles_table.has_shared_access_token_with_user", 60170);
        enhdVar.k("profiles_table.belongs_to_self_gaia", 59940);
        enhdVar.k("profiles_table.gaia_update_timestamp", 59940);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("participant_id", "index_profiles_table_participant_id");
        enhdVar2.k("contact_lookup_key", "index_profiles_table_contact_lookup_key");
        enhdVar2.k("phone_number", "index_profiles_table_phone_number");
        enhdVar2.c();
        c = new bwnk();
        d = new int[]{59710, 59730, 59940, 60170, 60200, 60340, 60400};
    }

    public static final bwon a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("profiles_table._id");
            engrVar.h("profiles_table.participant_id");
            if (c2.intValue() >= 60170) {
                engrVar.h("profiles_table.person_id");
            }
            if (c2.intValue() >= 60170) {
                engrVar.h("profiles_table.profile_access_token");
            }
            if (c2.intValue() >= 60200) {
                engrVar.h("profiles_table.sending_self_profile_interaction_state");
            }
            if (c2.intValue() >= 60340) {
                engrVar.h("profiles_table.self_profile_sharing_metadata");
            }
            engrVar.h("profiles_table.first_name");
            engrVar.h("profiles_table.last_name");
            engrVar.h("profiles_table.display_name");
            engrVar.h("profiles_table.photo_uri");
            if (c2.intValue() >= 60170) {
                engrVar.h("profiles_table.sender_last_updated_time");
            }
            if (c2.intValue() >= 60200) {
                engrVar.h("profiles_table.sender_last_updated_time_from_rcs");
            }
            engrVar.h("profiles_table.contact_lookup_key");
            engrVar.h("profiles_table.phone_number");
            if (c2.intValue() >= 60400) {
                engrVar.h("profiles_table.is_self_profile_shareable");
            }
            if (c2.intValue() >= 60170) {
                engrVar.h("profiles_table.has_shared_access_token_with_user");
            }
            engrVar.h("profiles_table.name_timestamp");
            engrVar.h("profiles_table.photo_timestamp");
            if (c2.intValue() >= 59940) {
                engrVar.h("profiles_table.belongs_to_self_gaia");
            }
            if (c2.intValue() >= 59940) {
                engrVar.h("profiles_table.gaia_update_timestamp");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bwon(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(f().a());
    }

    public static Object d(String str, dtuo dtuoVar, dtum dtumVar, dtun dtunVar) {
        return dtub.g(b(), str, dtuoVar, dtumVar, dtunVar);
    }

    public static void e(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INTEGER REFERENCES participants(_id) ON DELETE CASCADE ");
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("person_id TEXT");
        }
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("profile_access_token TEXT");
        }
        if (i >= 60200) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sending_self_profile_interaction_state INTEGER DEFAULT(0)");
        }
        if (i >= 60340) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("self_profile_sharing_metadata BLOB");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("first_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo_uri TEXT");
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sender_last_updated_time TEXT");
        }
        if (i >= 60200) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("sender_last_updated_time_from_rcs TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_lookup_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT NOT NULL");
        if (i >= 60400) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_self_profile_shareable INT DEFAULT(1)");
        }
        if (i >= 60170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("has_shared_access_token_with_user INTEGER DEFAULT(0)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo_timestamp INT DEFAULT(0)");
        if (i >= 59940) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("belongs_to_self_gaia INT DEFAULT(0)");
        }
        if (i >= 59940) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("gaia_update_timestamp INT DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE profiles_table (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_profiles_table_contact_lookup_key");
        arrayList.add("CREATE INDEX index_profiles_table_contact_lookup_key ON profiles_table(contact_lookup_key) WHERE contact_lookup_key NOT NULL;");
        arrayList.add("DROP INDEX IF EXISTS index_profiles_table_phone_number");
        arrayList.add("CREATE INDEX index_profiles_table_phone_number ON profiles_table(phone_number);");
        if (i >= 59730) {
            arrayList.add("DROP INDEX IF EXISTS index_profiles_table_participant_id");
            arrayList.add("CREATE INDEX index_profiles_table_participant_id ON profiles_table(participant_id) WHERE participant_id NOT NULL;");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf f() {
        return b().P();
    }
}
