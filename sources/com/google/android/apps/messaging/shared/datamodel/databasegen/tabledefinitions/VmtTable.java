package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.ardn;
import defpackage.byxi;
import defpackage.byxk;
import defpackage.byxl;
import defpackage.byxv;
import defpackage.byxw;
import defpackage.byxx;
import defpackage.byyc;
import defpackage.byyf;
import defpackage.byyg;
import defpackage.dtro;
import defpackage.dtrq;
import defpackage.dtsq;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtup;
import defpackage.dtve;
import defpackage.dtzf;
import defpackage.ekhw;
import defpackage.enhd;
import defpackage.enhk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class VmtTable extends dtup {
    public static final String[] a = {"vmt.part_id", "vmt.vmt_status", "vmt.text", "vmt.locale"};
    public static final enhk b = new enhd().c();
    public static final byxv c;
    public static final int[] d;

    /* compiled from: PG */
    public static abstract class BindData extends dtro<byxx, byyf, byyg, BindData, byxw> implements Parcelable, dtrq {
        public static final Parcelable.Creator<BindData> CREATOR = new byxi();
        public String a;
        public ardn b = ardn.VMT_STATUS_UNKNOWN;
        public String c;
        public String d;

        protected BindData() {
        }

        @Override // defpackage.dtro
        public final String a() {
            return String.format(Locale.US, "VmtTable [part_id: %s,\n  vmt_status: %s,\n  text: %s,\n  locale: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            dtub.u(contentValues, "part_id", this.a);
            ardn ardnVar = this.b;
            if (ardnVar == null) {
                contentValues.putNull("vmt_status");
            } else {
                contentValues.put("vmt_status", Integer.valueOf(ardnVar.a()));
            }
            dtub.u(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.c);
            dtub.u(contentValues, "locale", this.d);
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            byyc byycVar = (byyc) ((byxx) dtsuVar);
            aB();
            this.cL = byycVar.cU();
            if (byycVar.di(0)) {
                this.a = byycVar.c();
                fY(0);
            }
            if (byycVar.di(1)) {
                this.b = byycVar.e();
                fY(1);
            }
            if (byycVar.di(2)) {
                this.c = byycVar.g();
                fY(2);
            }
            if (byycVar.di(3)) {
                this.d = byycVar.f();
                fY(3);
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
            return super.aD(bindData.cL) && Objects.equals(this.a, bindData.a) && this.b == bindData.b && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d);
        }

        @Override // defpackage.dtrq
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "vmt", dtub.m(new String[]{"part_id", "vmt_status", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "locale"}));
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            this.a = parcel.readString();
            this.b = ardn.b(parcel.readInt());
            this.c = parcel.readString();
            this.d = parcel.readString();
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeString(this.a);
            ardn ardnVar = this.b;
            parcel.writeInt(ardnVar == null ? -1 : ardnVar.a());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }

        @Override // defpackage.dtrq
        public final String g() {
            return null;
        }

        @Override // defpackage.dtrq
        public final String h() {
            return "vmt";
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, null);
        }

        @Override // defpackage.dtrq
        public final void i(StringBuilder sb, List list) {
            String str = this.a;
            ardn ardnVar = this.b;
            Object[] objArr = {str, ardnVar == null ? 0 : String.valueOf(ardnVar.a()), this.c, this.d};
            sb.append('(');
            for (int i = 0; i < 4; i++) {
                Object obj = objArr[i];
                if (obj instanceof Number) {
                    sb.append(String.valueOf(obj));
                } else {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (str2.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str2));
                        }
                    }
                    list.add(obj);
                    sb.append('?');
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

        public final ardn k() {
            az(1, "vmt_status");
            return this.b;
        }

        public final String l() {
            az(3, "locale");
            return this.d;
        }

        public final String m() {
            az(0, "part_id");
            return this.a;
        }

        public final String n() {
            az(2, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            return this.c;
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "VmtTable -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            aA(parcel);
        }
    }

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("part_id", "index_vmt_part_id");
        enhdVar.c();
        c = new byxv();
        d = new int[]{58990};
    }

    public static byxk a() {
        byxl byxlVar = new byxl();
        byxlVar.aF();
        return byxlVar;
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static dtzf c() {
        return b().P();
    }

    public static void d(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("part_id INTEGER REFERENCES parts(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("vmt_status INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("locale TEXT");
        sb.insert(0, "CREATE TABLE vmt (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_vmt_part_id");
        arrayList.add("CREATE UNIQUE INDEX index_vmt_part_id ON vmt(part_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
