package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.a;
import defpackage.aorb;
import defpackage.aqkt;
import defpackage.azsu;
import defpackage.azsv;
import defpackage.azzr;
import defpackage.bdpy;
import defpackage.bdqb;
import defpackage.bdqc;
import defpackage.bvpi;
import defpackage.bvpj;
import defpackage.bvpo;
import defpackage.bvpp;
import defpackage.bvtg;
import defpackage.bvth;
import defpackage.bvti;
import defpackage.bvvd;
import defpackage.bvvl;
import defpackage.bvvn;
import defpackage.bvvr;
import defpackage.bvvw;
import defpackage.byzi;
import defpackage.cjwe;
import defpackage.cjwi;
import defpackage.csgg;
import defpackage.dtro;
import defpackage.dtrq;
import defpackage.dtsq;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtup;
import defpackage.dtve;
import defpackage.dtzf;
import defpackage.dtzq;
import defpackage.dtzu;
import defpackage.ekhw;
import defpackage.engr;
import defpackage.engw;
import defpackage.enhd;
import defpackage.enhk;
import defpackage.eyfc;
import defpackage.eyfy;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ParticipantsTable extends dtup {
    public static final String[] a = {"participants._id", "participants.my_identity_token", "participants.my_identity_token_foreign_key", "participants.sub_id", "participants.sim_slot_id", "participants.normalized_destination", "participants.send_destination", "participants.display_destination", "participants.comparable_destination", "participants.country_code", "participants.recipient_id", "participants.recipient_canonical_address", "participants.full_name", "participants.first_name", "participants.profile_photo_uri", "participants.contact_photo_uri", "participants.contact_id", "participants.lookup_key", "participants.color_palette_index", "participants.color_type", "participants.extended_color", "participants.blocked", "participants.subscription_name", "participants.subscription_color", "participants.contact_destination", "participants.participant_type", "participants.video_reachability", "participants.alias", "participants.is_spam", "participants.is_spam_source", "participants.cms_id", "participants.latest_verification_status", "participants.profile_photo_blob_id", "participants.profile_photo_encryption_key", "participants.directory_id", "participants.is_check_constraint_enabled_via_phenotype", "participants.is_valid_phone_number_data", "participants.duplicate_of", "participants.cms_life_cycle", "participants.norm_ui_status", "participants.last_modified_by_key", "participants.name_source", "participants.photo_source", "participants.profile_photo_user_preference", "participants.contact_metadata", "participants.is_enterprise_contact"};
    public static final enhk b;
    public static final bvtg c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("participants.my_identity_token", 59930);
        enhdVar.k("participants.my_identity_token_foreign_key", 60160);
        enhdVar.k("participants.sim_slot_id", 2000);
        enhdVar.k("participants.comparable_destination", 54040);
        enhdVar.k("participants.country_code", 54040);
        enhdVar.k("participants.recipient_id", 58090);
        enhdVar.k("participants.recipient_canonical_address", 58090);
        enhdVar.k("participants.contact_photo_uri", 59850);
        enhdVar.k("participants.color_type", 1000);
        enhdVar.k("participants.extended_color", 10027);
        enhdVar.k("participants.subscription_name", 2000);
        enhdVar.k("participants.subscription_color", 2000);
        enhdVar.k("participants.contact_destination", 4000);
        enhdVar.k("participants.participant_type", 12001);
        enhdVar.k("participants.video_reachability", 13050);
        enhdVar.k("participants.alias", 20060);
        enhdVar.k("participants.is_spam", 24060);
        enhdVar.k("participants.is_spam_source", 30000);
        enhdVar.k("participants.cms_id", 31020);
        enhdVar.k("participants.latest_verification_status", 31030);
        enhdVar.k("participants.profile_photo_blob_id", 33000);
        enhdVar.k("participants.profile_photo_encryption_key", 33060);
        enhdVar.k("participants.directory_id", 35010);
        enhdVar.k("participants.is_check_constraint_enabled_via_phenotype", 55010);
        enhdVar.k("participants.is_valid_phone_number_data", 55010);
        enhdVar.k("participants.duplicate_of", 58090);
        enhdVar.k("participants.cms_life_cycle", 58210);
        enhdVar.k("participants.norm_ui_status", 58620);
        enhdVar.k("participants.last_modified_by_key", 59440);
        enhdVar.k("participants.name_source", 59550);
        enhdVar.k("participants.photo_source", 59550);
        enhdVar.k("participants.profile_photo_user_preference", 60060);
        enhdVar.k("participants.contact_metadata", 60070);
        enhdVar.k("participants.is_enterprise_contact", 60640);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("my_identity_token", "index_participants_my_identity_token");
        enhdVar2.k("my_identity_token_foreign_key", "index_participants_my_identity_token_foreign_key");
        enhdVar2.k("sub_id", "index_participants_sub_id");
        enhdVar2.k("comparable_destination", "index_participants_comparable_destination");
        enhdVar2.k("recipient_id", "index_participants_recipient_id");
        enhdVar2.k("blocked", "index_participants_blocked_is_one");
        enhdVar2.k("cms_id", "index_participants_cms_id");
        enhdVar2.k("latest_verification_status", "index_participants_latest_verification_status_is_not_zero");
        enhdVar2.k("duplicate_of", "index_participants_duplicate_of");
        enhdVar2.k("is_enterprise_contact", "index_participants_is_enterprise_contact");
        enhdVar2.c();
        c = new bvtg();
        d = new int[]{1000, 2000, 4000, 10027, 12001, 13050, 20060, 24060, 29030, 30000, 31020, 31030, 33000, 33060, 35010, 54040, 55010, 58090, 58190, 58200, 58210, 58620, 59160, 59300, 59440, 59550, 59850, 59930, 60060, 60070, 60160, 60640};
        e = new int[]{57070};
    }

    public static BindData a(String str) {
        bvvn e2 = e();
        e2.z("participants.queryOnCmsId");
        e2.q();
        bvvw bvvwVar = new bvvw();
        bvvwVar.d(str);
        e2.g(bvvwVar);
        return (BindData) dtub.c(e2.b());
    }

    public static BindData b(String str) {
        bvvn e2 = e();
        e2.z("participants.queryOnId");
        e2.q();
        bvvw bvvwVar = new bvvw();
        bvvwVar.k(str);
        e2.g(bvvwVar);
        return (BindData) dtub.c(e2.b());
    }

    public static BindData c(String str) {
        BindData b2 = b(str);
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("row not found");
    }

    public static bvpo d() {
        bvpp bvppVar = new bvpp();
        bvppVar.aF();
        return bvppVar;
    }

    public static final bvvn e() {
        String[] strArr;
        Integer i = i();
        if (i.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i2 = engw.d;
            engr engrVar = new engr();
            engrVar.h("participants._id");
            if (i.intValue() >= 59930) {
                engrVar.h("participants.my_identity_token");
            }
            if (i.intValue() >= 60160) {
                engrVar.h("participants.my_identity_token_foreign_key");
            }
            engrVar.h("participants.sub_id");
            if (i.intValue() >= 2000) {
                engrVar.h("participants.sim_slot_id");
            }
            engrVar.h("participants.normalized_destination");
            engrVar.h("participants.send_destination");
            engrVar.h("participants.display_destination");
            if (i.intValue() >= 54040) {
                engrVar.h("participants.comparable_destination");
            }
            if (i.intValue() >= 54040) {
                engrVar.h("participants.country_code");
            }
            if (i.intValue() >= 58090) {
                engrVar.h("participants.recipient_id");
            }
            if (i.intValue() >= 58090) {
                engrVar.h("participants.recipient_canonical_address");
            }
            engrVar.h("participants.full_name");
            engrVar.h("participants.first_name");
            engrVar.h("participants.profile_photo_uri");
            if (i.intValue() >= 59850) {
                engrVar.h("participants.contact_photo_uri");
            }
            engrVar.h("participants.contact_id");
            engrVar.h("participants.lookup_key");
            engrVar.h("participants.color_palette_index");
            if (i.intValue() >= 1000) {
                engrVar.h("participants.color_type");
            }
            if (i.intValue() >= 10027) {
                engrVar.h("participants.extended_color");
            }
            engrVar.h("participants.blocked");
            if (i.intValue() >= 2000) {
                engrVar.h("participants.subscription_name");
            }
            if (i.intValue() >= 2000) {
                engrVar.h("participants.subscription_color");
            }
            if (i.intValue() >= 4000) {
                engrVar.h("participants.contact_destination");
            }
            if (i.intValue() >= 12001) {
                engrVar.h("participants.participant_type");
            }
            if (i.intValue() >= 13050) {
                engrVar.h("participants.video_reachability");
            }
            if (i.intValue() >= 20060) {
                engrVar.h("participants.alias");
            }
            if (i.intValue() >= 24060) {
                engrVar.h("participants.is_spam");
            }
            if (i.intValue() >= 30000) {
                engrVar.h("participants.is_spam_source");
            }
            if (i.intValue() >= 31020) {
                engrVar.h("participants.cms_id");
            }
            if (i.intValue() >= 31030) {
                engrVar.h("participants.latest_verification_status");
            }
            if (i.intValue() >= 33000) {
                engrVar.h("participants.profile_photo_blob_id");
            }
            if (i.intValue() >= 33060) {
                engrVar.h("participants.profile_photo_encryption_key");
            }
            if (i.intValue() >= 35010) {
                engrVar.h("participants.directory_id");
            }
            if (i.intValue() >= 55010) {
                engrVar.h("participants.is_check_constraint_enabled_via_phenotype");
            }
            if (i.intValue() >= 55010) {
                engrVar.h("participants.is_valid_phone_number_data");
            }
            if (i.intValue() >= 58090) {
                engrVar.h("participants.duplicate_of");
            }
            if (i.intValue() >= 58210) {
                engrVar.h("participants.cms_life_cycle");
            }
            if (i.intValue() >= 58620) {
                engrVar.h("participants.norm_ui_status");
            }
            if (i.intValue() >= 59440) {
                engrVar.h("participants.last_modified_by_key");
            }
            if (i.intValue() >= 59550) {
                engrVar.h("participants.name_source");
            }
            if (i.intValue() >= 59550) {
                engrVar.h("participants.photo_source");
            }
            if (i.intValue() >= 60060) {
                engrVar.h("participants.profile_photo_user_preference");
            }
            if (i.intValue() >= 60070) {
                engrVar.h("participants.contact_metadata");
            }
            if (i.intValue() >= 60640) {
                engrVar.h("participants.is_enterprise_contact");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bvvn(strArr);
    }

    public static bvvr f() {
        bvvr bvvrVar = new bvvr();
        if (i().intValue() >= 59440) {
            bdpy b2 = bdqb.b();
            int intValue = i().intValue();
            int intValue2 = i().intValue();
            if (intValue2 < 59440) {
                dtub.w("last_modified_by_key", intValue2);
            }
            if (intValue >= 59440) {
                bvvrVar.a.put("last_modified_by_key", bdqb.c(b2));
            }
            bvvrVar.e.b().c("last_modified_by_key");
        }
        return bvvrVar;
    }

    public static dtve g() {
        return dtub.e("$primary");
    }

    public static Optional h(String str) {
        return Optional.ofNullable(b(str));
    }

    public static Integer i() {
        return Integer.valueOf(q().a());
    }

    public static Object j(String str, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        BindData a2 = a(str);
        if (a2 != null) {
            apply = function.apply(a2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static Object k(String str, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        BindData b2 = b(str);
        if (b2 != null) {
            apply = function.apply(b2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static Object l(String str, Function function) {
        Object apply;
        BindData b2 = b(str);
        if (b2 == null) {
            return null;
        }
        apply = function.apply(b2);
        return apply;
    }

    public static Object m(String str, Function function, Supplier supplier) {
        Object obj;
        Object apply;
        BindData b2 = b(str);
        if (b2 != null) {
            apply = function.apply(b2);
            return apply;
        }
        obj = supplier.get();
        return obj;
    }

    public static String n(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (i >= 59930) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT DEFAULT(-2)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_slot_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("normalized_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("send_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("comparable_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("country_code TEXT");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("recipient_id INTEGER");
        }
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("recipient_canonical_address TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("full_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("first_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_uri TEXT");
        if (i >= 59850) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_photo_uri TEXT");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lookup_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_palette_index INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("color_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("extended_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blocked INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subscription_color INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("contact_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_type INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("video_reachability INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("alias TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_rcs_available INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_spam_source INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_verification_status INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("profile_photo_encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("directory_id INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_check_constraint_enabled_via_phenotype INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_valid_phone_number_data INT DEFAULT(1)");
        if (i >= 58090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("duplicate_of INTEGER REFERENCES participants(_id)  ");
        }
        if (i >= 58210) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_life_cycle INT DEFAULT(0)");
        }
        if (i >= 58620) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("norm_ui_status INT DEFAULT(1)");
        }
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        if (i >= 59550) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("name_source INT DEFAULT(1)");
        }
        if (i >= 59550) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("photo_source INT DEFAULT(1)");
        }
        if (i >= 60060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("profile_photo_user_preference INT DEFAULT(1)");
        }
        if (i >= 60070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("contact_metadata BLOB");
        }
        if (i >= 60640) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_enterprise_contact INT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(normalized_destination,sub_id) ON CONFLICT FAIL");
        sb.append(", CHECK (" + new dtzq("(NOT $R) OR (NOT $R) OR $R <> -2 OR ( $R IS NOT NULL AND $R IS NOT NULL AND $R IS NOT NULL  AND length($R) > 0 AND length($R) > 0 AND length($R) > 0 )", new Object[]{"is_valid_phone_number_data", "is_check_constraint_enabled_via_phenotype", "sub_id", "normalized_destination", "display_destination", "send_destination", "normalized_destination", "display_destination", "send_destination"}).ag(dtzu.b()) + ")");
        sb.append(");");
        return sb.toString();
    }

    public static void o(dtve dtveVar, int i) {
        dtub.J(dtveVar, "participants", n(i, "TEMP___participants"), a, p(i));
    }

    public static String[] p(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_participants_cms_id");
        arrayList.add("CREATE UNIQUE INDEX index_participants_cms_id ON participants(cms_id);");
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_comparable_destination");
            arrayList.add("CREATE UNIQUE INDEX index_participants_comparable_destination ON participants(comparable_destination);");
        }
        if (i >= 58090) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_recipient_id");
            arrayList.add("CREATE UNIQUE INDEX index_participants_recipient_id ON participants(recipient_id);");
        }
        if (i >= 58190) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_latest_verification_status_is_not_zero");
            arrayList.add("CREATE INDEX index_participants_latest_verification_status_is_not_zero ON participants(latest_verification_status) WHERE latest_verification_status <> 0;");
        }
        if (i >= 58200) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_blocked_is_one");
            arrayList.add("CREATE INDEX index_participants_blocked_is_one ON participants(blocked) WHERE blocked = 1;");
        }
        if (i >= 59160) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_duplicate_of");
            arrayList.add("CREATE INDEX index_participants_duplicate_of ON participants(duplicate_of) WHERE duplicate_of NOT NULL;");
        }
        if (i >= 59300) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_sub_id");
            arrayList.add("CREATE INDEX index_participants_sub_id ON participants(sub_id);");
        }
        if (i >= 59930) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_my_identity_token");
            arrayList.add("CREATE INDEX index_participants_my_identity_token ON participants(my_identity_token);");
        }
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_my_identity_token_foreign_key");
            arrayList.add("CREATE INDEX index_participants_my_identity_token_foreign_key ON participants(my_identity_token_foreign_key);");
        }
        if (i >= 60640) {
            arrayList.add("DROP INDEX IF EXISTS index_participants_is_enterprise_contact");
            arrayList.add("CREATE INDEX index_participants_is_enterprise_contact ON participants(is_enterprise_contact);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf q() {
        return g().P();
    }

    /* compiled from: PG */
    public static abstract class BindData extends dtro<bvti, bvvl, bvvn, BindData, bvth> implements Parcelable, dtrq {
        public static final Parcelable.Creator<BindData> CREATOR = new bvpi();
        public String B;
        public String E;
        public String G;
        public byte[] H;
        public String L;
        public cjwi P;
        public cjwi Q;
        public cjwe R;
        public aqkt S;
        public boolean T;
        public String a;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public long k;
        public String l;
        public String m;
        public String n;
        public Uri o;
        public Uri p;
        public String r;
        public String w;
        public String y;
        public azsu b = null;
        public azsu c = null;
        public int d = -2;
        public int e = -1;
        public long q = -1;
        public int s = -1;
        public int t = 0;
        public int u = 0;
        public boolean v = false;
        public int x = 0;
        public int z = 0;
        public int A = 0;
        public boolean C = false;
        public int D = 0;
        public byzi F = byzi.VERIFICATION_NA;
        public long I = -1;
        public boolean J = azzr.a();
        public boolean K = true;
        public csgg M = csgg.UNKNOWN;
        public aorb N = aorb.NOT_MODIFIED;
        public bdpy O = bdqc.a();

        protected BindData() {
            cjwi cjwiVar = cjwi.PROFILE_CONTACT_SOURCE;
            this.P = cjwiVar;
            this.Q = cjwiVar;
            this.R = cjwe.PREFER_PROFILE_PHOTO;
        }

        public final azsu A() {
            az(1, "my_identity_token");
            return this.b;
        }

        public final azsu B() {
            az(2, "my_identity_token_foreign_key");
            return this.c;
        }

        public final bvpo C() {
            bvpp bvppVar = new bvpp();
            BitSet bitSet = this.cJ;
            bvppVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
            BitSet bitSet2 = bvppVar.az;
            if (bitSet2 == null || bitSet2.get(0)) {
                bvppVar.a = S();
            }
            BitSet bitSet3 = bvppVar.az;
            if (bitSet3 == null || bitSet3.get(1)) {
                bvppVar.b = A();
            }
            BitSet bitSet4 = bvppVar.az;
            if (bitSet4 == null || bitSet4.get(2)) {
                bvppVar.c = B();
            }
            BitSet bitSet5 = bvppVar.az;
            if (bitSet5 == null || bitSet5.get(3)) {
                bvppVar.d = r();
            }
            BitSet bitSet6 = bvppVar.az;
            if (bitSet6 == null || bitSet6.get(4)) {
                bvppVar.e = q();
            }
            BitSet bitSet7 = bvppVar.az;
            if (bitSet7 == null || bitSet7.get(5)) {
                bvppVar.f = U();
            }
            BitSet bitSet8 = bvppVar.az;
            if (bitSet8 == null || bitSet8.get(6)) {
                bvppVar.g = W();
            }
            BitSet bitSet9 = bvppVar.az;
            if (bitSet9 == null || bitSet9.get(7)) {
                bvppVar.h = P();
            }
            BitSet bitSet10 = bvppVar.az;
            if (bitSet10 == null || bitSet10.get(8)) {
                bvppVar.i = M();
            }
            BitSet bitSet11 = bvppVar.az;
            if (bitSet11 == null || bitSet11.get(9)) {
                bvppVar.j = O();
            }
            BitSet bitSet12 = bvppVar.az;
            if (bitSet12 == null || bitSet12.get(10)) {
                az(10, "recipient_id");
                bvppVar.k = this.k;
            }
            BitSet bitSet13 = bvppVar.az;
            if (bitSet13 == null || bitSet13.get(11)) {
                az(11, "recipient_canonical_address");
                bvppVar.l = this.l;
            }
            BitSet bitSet14 = bvppVar.az;
            if (bitSet14 == null || bitSet14.get(12)) {
                bvppVar.m = R();
            }
            BitSet bitSet15 = bvppVar.az;
            if (bitSet15 == null || bitSet15.get(13)) {
                bvppVar.n = Q();
            }
            BitSet bitSet16 = bvppVar.az;
            if (bitSet16 == null || bitSet16.get(14)) {
                bvppVar.o = x();
            }
            BitSet bitSet17 = bvppVar.az;
            if (bitSet17 == null || bitSet17.get(15)) {
                bvppVar.p = w();
            }
            BitSet bitSet18 = bvppVar.az;
            if (bitSet18 == null || bitSet18.get(16)) {
                bvppVar.q = u();
            }
            BitSet bitSet19 = bvppVar.az;
            if (bitSet19 == null || bitSet19.get(17)) {
                bvppVar.r = T();
            }
            BitSet bitSet20 = bvppVar.az;
            if (bitSet20 == null || bitSet20.get(18)) {
                bvppVar.s = k();
            }
            BitSet bitSet21 = bvppVar.az;
            if (bitSet21 == null || bitSet21.get(19)) {
                bvppVar.t = l();
            }
            BitSet bitSet22 = bvppVar.az;
            if (bitSet22 == null || bitSet22.get(20)) {
                bvppVar.u = m();
            }
            BitSet bitSet23 = bvppVar.az;
            if (bitSet23 == null || bitSet23.get(21)) {
                bvppVar.v = Y();
            }
            BitSet bitSet24 = bvppVar.az;
            if (bitSet24 == null || bitSet24.get(22)) {
                bvppVar.w = X();
            }
            BitSet bitSet25 = bvppVar.az;
            if (bitSet25 == null || bitSet25.get(23)) {
                bvppVar.x = s();
            }
            BitSet bitSet26 = bvppVar.az;
            if (bitSet26 == null || bitSet26.get(24)) {
                bvppVar.y = N();
            }
            BitSet bitSet27 = bvppVar.az;
            if (bitSet27 == null || bitSet27.get(25)) {
                bvppVar.z = o();
            }
            BitSet bitSet28 = bvppVar.az;
            if (bitSet28 == null || bitSet28.get(26)) {
                bvppVar.A = t();
            }
            BitSet bitSet29 = bvppVar.az;
            if (bitSet29 == null || bitSet29.get(27)) {
                bvppVar.B = K();
            }
            BitSet bitSet30 = bvppVar.az;
            if (bitSet30 == null || bitSet30.get(28)) {
                bvppVar.C = ab();
            }
            BitSet bitSet31 = bvppVar.az;
            if (bitSet31 == null || bitSet31.get(29)) {
                bvppVar.D = n();
            }
            BitSet bitSet32 = bvppVar.az;
            if (bitSet32 == null || bitSet32.get(30)) {
                bvppVar.E = L();
            }
            BitSet bitSet33 = bvppVar.az;
            if (bitSet33 == null || bitSet33.get(31)) {
                bvppVar.F = D();
            }
            BitSet bitSet34 = bvppVar.az;
            if (bitSet34 == null || bitSet34.get(32)) {
                bvppVar.G = V();
            }
            BitSet bitSet35 = bvppVar.az;
            if (bitSet35 == null || bitSet35.get(33)) {
                bvppVar.H = ad();
            }
            BitSet bitSet36 = bvppVar.az;
            if (bitSet36 == null || bitSet36.get(34)) {
                bvppVar.I = v();
            }
            BitSet bitSet37 = bvppVar.az;
            if (bitSet37 == null || bitSet37.get(35)) {
                bvppVar.J = Z();
            }
            BitSet bitSet38 = bvppVar.az;
            if (bitSet38 == null || bitSet38.get(36)) {
                bvppVar.K = ac();
            }
            BitSet bitSet39 = bvppVar.az;
            if (bitSet39 == null || bitSet39.get(37)) {
                az(37, "duplicate_of");
                bvppVar.L = this.L;
            }
            BitSet bitSet40 = bvppVar.az;
            if (bitSet40 == null || bitSet40.get(38)) {
                bvppVar.M = H();
            }
            BitSet bitSet41 = bvppVar.az;
            if (bitSet41 == null || bitSet41.get(39)) {
                bvppVar.N = y();
            }
            BitSet bitSet42 = bvppVar.az;
            if (bitSet42 == null || bitSet42.get(40)) {
                az(40, "last_modified_by_key");
                bvppVar.O = this.O;
            }
            BitSet bitSet43 = bvppVar.az;
            if (bitSet43 == null || bitSet43.get(41)) {
                bvppVar.P = F();
            }
            BitSet bitSet44 = bvppVar.az;
            if (bitSet44 == null || bitSet44.get(42)) {
                bvppVar.Q = G();
            }
            BitSet bitSet45 = bvppVar.az;
            if (bitSet45 == null || bitSet45.get(43)) {
                bvppVar.R = E();
            }
            BitSet bitSet46 = bvppVar.az;
            if (bitSet46 == null || bitSet46.get(44)) {
                bvppVar.S = z();
            }
            BitSet bitSet47 = bvppVar.az;
            if (bitSet47 != null && !bitSet47.get(45)) {
                return bvppVar;
            }
            bvppVar.T = aa();
            return bvppVar;
        }

        public final byzi D() {
            az(31, "latest_verification_status");
            return this.F;
        }

        public final cjwe E() {
            az(43, "profile_photo_user_preference");
            return this.R;
        }

        public final cjwi F() {
            az(41, "name_source");
            return this.P;
        }

        public final cjwi G() {
            az(42, "photo_source");
            return this.Q;
        }

        public final csgg H() {
            az(38, "cms_life_cycle");
            return this.M;
        }

        @Deprecated
        public final Long I() {
            final dtve g = ParticipantsTable.g();
            return Long.valueOf(dtub.b(ParticipantsTable.g(), "participants", this, new Function() { // from class: bvph
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.R("participants", (ContentValues) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bvpc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    final Long l = (Long) obj;
                    if (l.longValue() >= 0) {
                        ParticipantsTable.BindData bindData = ParticipantsTable.BindData.this;
                        bindData.a = (String) new dtuj() { // from class: bvpe
                            @Override // defpackage.dtuj
                            public final Object a() {
                                return String.valueOf(l);
                            }
                        }.a();
                        bindData.fY(0);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final Long J() {
            final dtve g = ParticipantsTable.g();
            return Long.valueOf(dtub.b(ParticipantsTable.g(), "participants", this, new Function() { // from class: bvpf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.S("participants", (ContentValues) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bvpg
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    final Long l = (Long) obj;
                    if (l.longValue() >= 0) {
                        ParticipantsTable.BindData bindData = ParticipantsTable.BindData.this;
                        bindData.a = (String) new dtuj() { // from class: bvpd
                            @Override // defpackage.dtuj
                            public final Object a() {
                                return String.valueOf(l);
                            }
                        }.a();
                        bindData.fY(0);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final String K() {
            az(27, "alias");
            return this.B;
        }

        public final String L() {
            az(30, "cms_id");
            return this.E;
        }

        public final String M() {
            az(8, "comparable_destination");
            return this.i;
        }

        public final String N() {
            az(24, "contact_destination");
            return this.y;
        }

        public final String O() {
            az(9, "country_code");
            return this.j;
        }

        public final String P() {
            az(7, "display_destination");
            return this.h;
        }

        public final String Q() {
            az(13, "first_name");
            return this.n;
        }

        public final String R() {
            az(12, "full_name");
            return this.m;
        }

        public final String S() {
            az(0, "_id");
            return this.a;
        }

        public final String T() {
            az(17, "lookup_key");
            return this.r;
        }

        public final String U() {
            az(5, "normalized_destination");
            return this.f;
        }

        public final String V() {
            az(32, "profile_photo_blob_id");
            return this.G;
        }

        public final String W() {
            az(6, "send_destination");
            return this.g;
        }

        public final String X() {
            az(22, "subscription_name");
            return this.w;
        }

        public final boolean Y() {
            az(21, "blocked");
            return this.v;
        }

        public final boolean Z() {
            az(35, "is_check_constraint_enabled_via_phenotype");
            return this.J;
        }

        @Override // defpackage.dtro
        public final String a() {
            Locale locale = Locale.US;
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.b);
            String valueOf3 = String.valueOf(this.c);
            String valueOf4 = String.valueOf(this.d);
            String valueOf5 = String.valueOf(this.e);
            String valueOf6 = String.valueOf(this.f);
            String valueOf7 = String.valueOf(this.g);
            String valueOf8 = String.valueOf(this.h);
            String valueOf9 = String.valueOf(this.i);
            String valueOf10 = String.valueOf(this.j);
            String valueOf11 = String.valueOf(this.k);
            String valueOf12 = String.valueOf(this.l);
            String valueOf13 = String.valueOf(this.m);
            String valueOf14 = String.valueOf(this.n);
            String valueOf15 = String.valueOf(this.o);
            String valueOf16 = String.valueOf(this.p);
            String valueOf17 = String.valueOf(this.q);
            String valueOf18 = String.valueOf(this.r);
            String valueOf19 = String.valueOf(this.s);
            String valueOf20 = String.valueOf(this.t);
            String valueOf21 = String.valueOf(this.u);
            String valueOf22 = String.valueOf(this.v);
            String valueOf23 = String.valueOf(this.w);
            String valueOf24 = String.valueOf(this.x);
            String valueOf25 = String.valueOf(this.y);
            String valueOf26 = String.valueOf(this.z);
            String valueOf27 = String.valueOf(this.A);
            String valueOf28 = String.valueOf(this.B);
            String valueOf29 = String.valueOf(this.C);
            String valueOf30 = String.valueOf(this.D);
            String valueOf31 = String.valueOf(this.E);
            String valueOf32 = String.valueOf(this.F);
            String valueOf33 = String.valueOf(this.G);
            byte[] bArr = this.H;
            return String.format(locale, "ParticipantsTable [_id: %s,\n  my_identity_token: %s,\n  my_identity_token_foreign_key: %s,\n  sub_id: %s,\n  sim_slot_id: %s,\n  normalized_destination: %s,\n  send_destination: %s,\n  display_destination: %s,\n  comparable_destination: %s,\n  country_code: %s,\n  recipient_id: %s,\n  recipient_canonical_address: %s,\n  full_name: %s,\n  first_name: %s,\n  profile_photo_uri: %s,\n  contact_photo_uri: %s,\n  contact_id: %s,\n  lookup_key: %s,\n  color_palette_index: %s,\n  color_type: %s,\n  extended_color: %s,\n  blocked: %s,\n  subscription_name: %s,\n  subscription_color: %s,\n  contact_destination: %s,\n  participant_type: %s,\n  video_reachability: %s,\n  alias: %s,\n  is_spam: %s,\n  is_spam_source: %s,\n  cms_id: %s,\n  latest_verification_status: %s,\n  profile_photo_blob_id: %s,\n  profile_photo_encryption_key: %s,\n  directory_id: %s,\n  is_check_constraint_enabled_via_phenotype: %s,\n  is_valid_phone_number_data: %s,\n  duplicate_of: %s,\n  cms_life_cycle: %s,\n  norm_ui_status: %s,\n  last_modified_by_key: %s,\n  name_source: %s,\n  photo_source: %s,\n  profile_photo_user_preference: %s,\n  contact_metadata: %s,\n  is_enterprise_contact: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T));
        }

        public final boolean aa() {
            az(45, "is_enterprise_contact");
            return this.T;
        }

        public final boolean ab() {
            az(28, "is_spam");
            return this.C;
        }

        public final boolean ac() {
            az(36, "is_valid_phone_number_data");
            return this.K;
        }

        public final byte[] ad() {
            az(33, "profile_photo_encryption_key");
            return this.H;
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            int intValue = ParticipantsTable.i().intValue();
            if (intValue >= 59930) {
                azsu azsuVar = this.b;
                if (azsuVar == null) {
                    contentValues.putNull("my_identity_token");
                } else {
                    contentValues.put("my_identity_token", azsv.b(azsuVar));
                }
            }
            if (intValue >= 60160) {
                azsu azsuVar2 = this.c;
                if (azsuVar2 == null || azsuVar2.equals(null)) {
                    contentValues.putNull("my_identity_token_foreign_key");
                } else {
                    contentValues.put("my_identity_token_foreign_key", azsv.b(this.c));
                }
            }
            contentValues.put("sub_id", Integer.valueOf(this.d));
            if (intValue >= 2000) {
                contentValues.put("sim_slot_id", Integer.valueOf(this.e));
            }
            dtub.u(contentValues, "normalized_destination", this.f);
            dtub.u(contentValues, "send_destination", this.g);
            dtub.u(contentValues, "display_destination", this.h);
            if (intValue >= 54040) {
                dtub.u(contentValues, "comparable_destination", this.i);
            }
            if (intValue >= 54040) {
                dtub.u(contentValues, "country_code", this.j);
            }
            if (intValue >= 58090) {
                dtub.t(contentValues, "recipient_id", this.k);
            }
            if (intValue >= 58090) {
                dtub.u(contentValues, "recipient_canonical_address", this.l);
            }
            dtub.u(contentValues, "full_name", this.m);
            dtub.u(contentValues, "first_name", this.n);
            Uri uri = this.o;
            if (uri == null) {
                contentValues.putNull("profile_photo_uri");
            } else {
                contentValues.put("profile_photo_uri", uri.toString());
            }
            if (intValue >= 59850) {
                Uri uri2 = this.p;
                if (uri2 == null) {
                    contentValues.putNull("contact_photo_uri");
                } else {
                    contentValues.put("contact_photo_uri", uri2.toString());
                }
            }
            contentValues.put("contact_id", Long.valueOf(this.q));
            dtub.u(contentValues, "lookup_key", this.r);
            contentValues.put("color_palette_index", Integer.valueOf(this.s));
            if (intValue >= 1000) {
                contentValues.put("color_type", Integer.valueOf(this.t));
            }
            if (intValue >= 10027) {
                contentValues.put("extended_color", Integer.valueOf(this.u));
            }
            contentValues.put("blocked", Boolean.valueOf(this.v));
            if (intValue >= 2000) {
                dtub.u(contentValues, "subscription_name", this.w);
            }
            if (intValue >= 2000) {
                contentValues.put("subscription_color", Integer.valueOf(this.x));
            }
            if (intValue >= 4000) {
                dtub.u(contentValues, "contact_destination", this.y);
            }
            if (intValue >= 12001) {
                contentValues.put("participant_type", Integer.valueOf(this.z));
            }
            if (intValue >= 13050) {
                contentValues.put("video_reachability", Integer.valueOf(this.A));
            }
            if (intValue >= 20060) {
                dtub.u(contentValues, "alias", this.B);
            }
            if (intValue >= 24060) {
                contentValues.put("is_spam", Boolean.valueOf(this.C));
            }
            if (intValue >= 30000) {
                contentValues.put("is_spam_source", Integer.valueOf(this.D));
            }
            if (intValue >= 31020) {
                dtub.u(contentValues, "cms_id", this.E);
            }
            if (intValue >= 31030) {
                byzi byziVar = this.F;
                if (byziVar == null) {
                    contentValues.putNull("latest_verification_status");
                } else {
                    contentValues.put("latest_verification_status", Integer.valueOf(byziVar.ordinal()));
                }
            }
            if (intValue >= 33000) {
                dtub.u(contentValues, "profile_photo_blob_id", this.G);
            }
            if (intValue >= 33060) {
                contentValues.put("profile_photo_encryption_key", this.H);
            }
            if (intValue >= 35010) {
                contentValues.put("directory_id", Long.valueOf(this.I));
            }
            if (intValue >= 55010) {
                contentValues.put("is_check_constraint_enabled_via_phenotype", Boolean.valueOf(this.J));
            }
            if (intValue >= 55010) {
                contentValues.put("is_valid_phone_number_data", Boolean.valueOf(this.K));
            }
            if (intValue >= 58090) {
                dtub.u(contentValues, "duplicate_of", this.L);
            }
            if (intValue >= 58210) {
                csgg csggVar = this.M;
                if (csggVar == null) {
                    contentValues.putNull("cms_life_cycle");
                } else {
                    contentValues.put("cms_life_cycle", Integer.valueOf(csggVar.ordinal()));
                }
            }
            if (intValue >= 58620) {
                aorb aorbVar = this.N;
                if (aorbVar == null) {
                    contentValues.putNull("norm_ui_status");
                } else {
                    contentValues.put("norm_ui_status", Integer.valueOf(aorbVar.a()));
                }
            }
            if (intValue >= 59440) {
                bdpy bdpyVar = this.O;
                if (bdpyVar == null) {
                    contentValues.putNull("last_modified_by_key");
                } else {
                    contentValues.put("last_modified_by_key", bdqb.c(bdpyVar));
                }
            }
            if (intValue >= 59550) {
                cjwi cjwiVar = this.P;
                if (cjwiVar == null) {
                    contentValues.putNull("name_source");
                } else {
                    contentValues.put("name_source", Integer.valueOf(cjwiVar.a()));
                }
            }
            if (intValue >= 59550) {
                cjwi cjwiVar2 = this.Q;
                if (cjwiVar2 == null) {
                    contentValues.putNull("photo_source");
                } else {
                    contentValues.put("photo_source", Integer.valueOf(cjwiVar2.a()));
                }
            }
            if (intValue >= 60060) {
                cjwe cjweVar = this.R;
                if (cjweVar == null) {
                    contentValues.putNull("profile_photo_user_preference");
                } else {
                    contentValues.put("profile_photo_user_preference", Integer.valueOf(cjweVar.a()));
                }
            }
            if (intValue >= 60070) {
                aqkt aqktVar = this.S;
                if (aqktVar == null) {
                    contentValues.putNull("contact_metadata");
                } else {
                    contentValues.put("contact_metadata", aqktVar.toByteArray());
                }
            }
            if (intValue >= 60640) {
                contentValues.put("is_enterprise_contact", Boolean.valueOf(this.T));
            }
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            bvvd bvvdVar = (bvvd) ((bvti) dtsuVar);
            aB();
            this.cL = bvvdVar.cU();
            if (bvvdVar.di(0)) {
                this.a = bvvdVar.p();
                fY(0);
            }
            if (bvvdVar.di(1)) {
                this.b = bvvdVar.H();
                fY(1);
            }
            if (bvvdVar.di(2)) {
                this.c = bvvdVar.I();
                fY(2);
            }
            if (bvvdVar.di(3)) {
                this.d = bvvdVar.z();
                fY(3);
            }
            if (bvvdVar.di(4)) {
                this.e = bvvdVar.y();
                fY(4);
            }
            if (bvvdVar.di(5)) {
                this.f = bvvdVar.r();
                fY(5);
            }
            if (bvvdVar.di(6)) {
                this.g = bvvdVar.s();
                fY(6);
            }
            if (bvvdVar.di(7)) {
                this.h = bvvdVar.R();
                fY(7);
            }
            if (bvvdVar.di(8)) {
                this.i = bvvdVar.O();
                fY(8);
            }
            if (bvvdVar.di(9)) {
                this.j = bvvdVar.Q();
                fY(9);
            }
            if (bvvdVar.di(10)) {
                this.k = bvvdVar.D();
                fY(10);
            }
            if (bvvdVar.di(11)) {
                this.l = bvvdVar.W();
                fY(11);
            }
            if (bvvdVar.di(12)) {
                this.m = bvvdVar.U();
                fY(12);
            }
            if (bvvdVar.di(13)) {
                this.n = bvvdVar.T();
                fY(13);
            }
            if (bvvdVar.di(14)) {
                this.o = bvvdVar.g();
                fY(14);
            }
            if (bvvdVar.di(15)) {
                this.p = bvvdVar.E();
                fY(15);
            }
            if (bvvdVar.di(16)) {
                this.q = bvvdVar.f();
                fY(16);
            }
            if (bvvdVar.di(17)) {
                this.r = bvvdVar.q();
                fY(17);
            }
            if (bvvdVar.di(18)) {
                this.s = bvvdVar.v();
                fY(18);
            }
            if (bvvdVar.di(19)) {
                this.t = bvvdVar.w();
                fY(19);
            }
            if (bvvdVar.di(20)) {
                this.u = bvvdVar.x();
                fY(20);
            }
            if (bvvdVar.di(21)) {
                this.v = bvvdVar.t();
                fY(21);
            }
            if (bvvdVar.di(22)) {
                this.w = bvvdVar.X();
                fY(22);
            }
            if (bvvdVar.di(23)) {
                this.x = bvvdVar.A();
                fY(23);
            }
            if (bvvdVar.di(24)) {
                this.y = bvvdVar.P();
                fY(24);
            }
            if (bvvdVar.di(25)) {
                this.z = bvvdVar.e();
                fY(25);
            }
            if (bvvdVar.di(26)) {
                this.A = bvvdVar.B();
                fY(26);
            }
            if (bvvdVar.di(27)) {
                this.B = bvvdVar.M();
                fY(27);
            }
            if (bvvdVar.di(28)) {
                this.C = bvvdVar.u();
                fY(28);
            }
            if (bvvdVar.di(29)) {
                this.D = bvvdVar.c();
                fY(29);
            }
            if (bvvdVar.di(30)) {
                this.E = bvvdVar.N();
                fY(30);
            }
            if (bvvdVar.di(31)) {
                this.F = bvvdVar.h();
                fY(31);
            }
            if (bvvdVar.di(32)) {
                this.G = bvvdVar.V();
                fY(32);
            }
            if (bvvdVar.di(33)) {
                this.H = bvvdVar.ab();
                fY(33);
            }
            if (bvvdVar.di(34)) {
                this.I = bvvdVar.C();
                fY(34);
            }
            if (bvvdVar.di(35)) {
                this.J = bvvdVar.Y();
                fY(35);
            }
            if (bvvdVar.di(36)) {
                this.K = bvvdVar.aa();
                fY(36);
            }
            if (bvvdVar.di(37)) {
                this.L = bvvdVar.S();
                fY(37);
            }
            if (bvvdVar.di(38)) {
                this.M = bvvdVar.j();
                fY(38);
            }
            if (bvvdVar.di(39)) {
                this.N = bvvdVar.F();
                fY(39);
            }
            if (bvvdVar.di(40)) {
                this.O = bvvdVar.J();
                fY(40);
            }
            if (bvvdVar.di(41)) {
                this.P = bvvdVar.L();
                fY(41);
            }
            if (bvvdVar.di(42)) {
                this.Q = bvvdVar.i();
                fY(42);
            }
            if (bvvdVar.di(43)) {
                this.R = bvvdVar.K();
                fY(43);
            }
            if (bvvdVar.di(44)) {
                this.S = bvvdVar.G();
                fY(44);
            }
            if (bvvdVar.di(45)) {
                this.T = bvvdVar.Z();
                fY(45);
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
            return super.aD(bindData.cL) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && this.d == bindData.d && this.e == bindData.e && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && Objects.equals(this.j, bindData.j) && this.k == bindData.k && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && Objects.equals(this.n, bindData.n) && Objects.equals(this.o, bindData.o) && Objects.equals(this.p, bindData.p) && this.q == bindData.q && Objects.equals(this.r, bindData.r) && this.s == bindData.s && this.t == bindData.t && this.u == bindData.u && this.v == bindData.v && Objects.equals(this.w, bindData.w) && this.x == bindData.x && Objects.equals(this.y, bindData.y) && this.z == bindData.z && this.A == bindData.A && Objects.equals(this.B, bindData.B) && this.C == bindData.C && this.D == bindData.D && Objects.equals(this.E, bindData.E) && this.F == bindData.F && Objects.equals(this.G, bindData.G) && Arrays.equals(this.H, bindData.H) && this.I == bindData.I && this.J == bindData.J && this.K == bindData.K && Objects.equals(this.L, bindData.L) && this.M == bindData.M && this.N == bindData.N && Objects.equals(this.O, bindData.O) && this.P == bindData.P && this.Q == bindData.Q && this.R == bindData.R && Objects.equals(this.S, bindData.S) && this.T == bindData.T;
        }

        @Override // defpackage.dtrq
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "participants", dtub.m(new String[]{"my_identity_token", "my_identity_token_foreign_key", "sub_id", "sim_slot_id", "normalized_destination", "send_destination", "display_destination", "comparable_destination", "country_code", "recipient_id", "recipient_canonical_address", "full_name", "first_name", "profile_photo_uri", "contact_photo_uri", "contact_id", "lookup_key", "color_palette_index", "color_type", "extended_color", "blocked", "subscription_name", "subscription_color", "contact_destination", "participant_type", "video_reachability", "alias", "is_spam", "is_spam_source", "cms_id", "latest_verification_status", "profile_photo_blob_id", "profile_photo_encryption_key", "directory_id", "is_check_constraint_enabled_via_phenotype", "is_valid_phone_number_data", "duplicate_of", "cms_life_cycle", "norm_ui_status", "last_modified_by_key", "name_source", "photo_source", "profile_photo_user_preference", "contact_metadata", "is_enterprise_contact"}));
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            aqkt aqktVar;
            this.a = parcel.readString();
            this.b = azsv.a(parcel.readString());
            this.c = azsv.a(parcel.readString());
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readLong();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readString();
            String readString = parcel.readString();
            this.o = readString == null ? null : Uri.parse(readString);
            String readString2 = parcel.readString();
            this.p = readString2 == null ? null : Uri.parse(readString2);
            this.q = parcel.readLong();
            this.r = parcel.readString();
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readInt();
            this.v = parcel.readInt() == 1;
            this.w = parcel.readString();
            this.x = parcel.readInt();
            this.y = parcel.readString();
            this.z = parcel.readInt();
            this.A = parcel.readInt();
            this.B = parcel.readString();
            this.C = parcel.readInt() == 1;
            this.D = parcel.readInt();
            this.E = parcel.readString();
            byzi[] values = byzi.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt >= values.length) {
                    throw new IllegalArgumentException();
                }
                this.F = values[readInt];
            }
            this.G = parcel.readString();
            this.H = parcel.createByteArray();
            this.I = parcel.readLong();
            this.J = parcel.readInt() == 1;
            this.K = parcel.readInt() == 1;
            this.L = parcel.readString();
            csgg[] values2 = csgg.values();
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                if (readInt2 >= values2.length) {
                    throw new IllegalArgumentException();
                }
                this.M = values2[readInt2];
            }
            this.N = aorb.b(parcel.readInt());
            this.O = bdqb.a(parcel.readString());
            this.P = cjwi.b(parcel.readInt());
            this.Q = cjwi.b(parcel.readInt());
            this.R = cjwe.b(parcel.readInt());
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                aqktVar = null;
            } else {
                try {
                    aqktVar = (aqkt) eyfy.parseFrom(aqkt.a, createByteArray, eyfc.a());
                } catch (Throwable unused) {
                    this.S = null;
                }
            }
            this.S = aqktVar;
            this.T = parcel.readInt() == 1;
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeString(azsv.b(this.b));
            parcel.writeString(azsv.b(this.c));
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeLong(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeString(this.n);
            Uri uri = this.o;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.p;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            parcel.writeLong(this.q);
            parcel.writeString(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeString(this.w);
            parcel.writeInt(this.x);
            parcel.writeString(this.y);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A);
            parcel.writeString(this.B);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D);
            parcel.writeString(this.E);
            byzi byziVar = this.F;
            parcel.writeInt(byziVar == null ? -1 : byziVar.ordinal());
            parcel.writeString(this.G);
            parcel.writeByteArray(this.H);
            parcel.writeLong(this.I);
            parcel.writeInt(this.J ? 1 : 0);
            parcel.writeInt(this.K ? 1 : 0);
            parcel.writeString(this.L);
            csgg csggVar = this.M;
            parcel.writeInt(csggVar == null ? -1 : csggVar.ordinal());
            aorb aorbVar = this.N;
            parcel.writeInt(aorbVar == null ? -1 : aorbVar.a());
            parcel.writeString(bdqb.c(this.O));
            cjwi cjwiVar = this.P;
            parcel.writeInt(cjwiVar == null ? -1 : cjwiVar.a());
            cjwi cjwiVar2 = this.Q;
            parcel.writeInt(cjwiVar2 == null ? -1 : cjwiVar2.a());
            cjwe cjweVar = this.R;
            parcel.writeInt(cjweVar != null ? cjweVar.a() : -1);
            aqkt aqktVar = this.S;
            parcel.writeByteArray(aqktVar != null ? aqktVar.toByteArray() : null);
            parcel.writeInt(this.T ? 1 : 0);
        }

        @Override // defpackage.dtrq
        public final String g() {
            return "_id";
        }

        @Override // defpackage.dtrq
        public final String h() {
            return "participants";
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
            String str = this.a;
            azsu azsuVar = this.b;
            azsu azsuVar2 = this.c;
            Integer valueOf = Integer.valueOf(this.d);
            Integer valueOf2 = Integer.valueOf(this.e);
            String str2 = this.f;
            String str3 = this.g;
            String str4 = this.h;
            String str5 = this.i;
            String str6 = this.j;
            Long valueOf3 = Long.valueOf(this.k);
            String str7 = this.l;
            String str8 = this.m;
            String str9 = this.n;
            dtsq dtsqVar3 = dtsqVar2;
            Uri uri = this.o;
            Uri uri2 = this.p;
            Long valueOf4 = Long.valueOf(this.q);
            String str10 = this.r;
            Integer valueOf5 = Integer.valueOf(this.s);
            Integer valueOf6 = Integer.valueOf(this.t);
            Integer valueOf7 = Integer.valueOf(this.u);
            Boolean valueOf8 = Boolean.valueOf(this.v);
            String str11 = this.w;
            Integer valueOf9 = Integer.valueOf(this.x);
            String str12 = this.y;
            Integer valueOf10 = Integer.valueOf(this.z);
            Integer valueOf11 = Integer.valueOf(this.A);
            String str13 = this.B;
            Boolean valueOf12 = Boolean.valueOf(this.C);
            Integer valueOf13 = Integer.valueOf(this.D);
            String str14 = this.E;
            byzi byziVar = this.F;
            Integer valueOf14 = Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal());
            String str15 = this.G;
            Integer valueOf15 = Integer.valueOf(Arrays.hashCode(this.H));
            Long valueOf16 = Long.valueOf(this.I);
            Boolean valueOf17 = Boolean.valueOf(this.J);
            Boolean valueOf18 = Boolean.valueOf(this.K);
            String str16 = this.L;
            csgg csggVar = this.M;
            return Objects.hash(dtsqVar3, str, azsuVar, azsuVar2, valueOf, valueOf2, str2, str3, str4, str5, str6, valueOf3, str7, str8, str9, uri, uri2, valueOf4, str10, valueOf5, valueOf6, valueOf7, valueOf8, str11, valueOf9, str12, valueOf10, valueOf11, str13, valueOf12, valueOf13, str14, valueOf14, str15, valueOf15, valueOf16, valueOf17, valueOf18, str16, Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal()), this.N, this.O, this.P, this.Q, this.R, this.S, Boolean.valueOf(this.T), null);
        }

        @Override // defpackage.dtrq
        public final void i(StringBuilder sb, List list) {
            String b = azsv.b(this.b);
            Object obj = new bvpj(this).get();
            Integer valueOf = Integer.valueOf(this.d);
            Integer valueOf2 = Integer.valueOf(this.e);
            String str = this.f;
            String str2 = this.g;
            String str3 = this.h;
            String str4 = this.i;
            String str5 = this.j;
            Long valueOf3 = Long.valueOf(this.k);
            String str6 = this.l;
            String str7 = this.m;
            String str8 = this.n;
            Uri uri = this.o;
            String uri2 = uri == null ? null : uri.toString();
            Uri uri3 = this.p;
            String uri4 = uri3 == null ? null : uri3.toString();
            Long valueOf4 = Long.valueOf(this.q);
            String str9 = this.r;
            Integer valueOf5 = Integer.valueOf(this.s);
            Integer valueOf6 = Integer.valueOf(this.t);
            Integer valueOf7 = Integer.valueOf(this.u);
            Integer valueOf8 = Integer.valueOf(this.v ? 1 : 0);
            String str10 = this.w;
            Integer valueOf9 = Integer.valueOf(this.x);
            String str11 = this.y;
            Integer valueOf10 = Integer.valueOf(this.z);
            Integer valueOf11 = Integer.valueOf(this.A);
            String str12 = this.B;
            Integer valueOf12 = Integer.valueOf(this.C ? 1 : 0);
            Integer valueOf13 = Integer.valueOf(this.D);
            String str13 = this.E;
            byzi byziVar = this.F;
            Object valueOf14 = byziVar == null ? 0 : String.valueOf(byziVar.ordinal());
            String str14 = this.G;
            byte[] bArr = this.H;
            Long valueOf15 = Long.valueOf(this.I);
            Integer valueOf16 = Integer.valueOf(this.J ? 1 : 0);
            Integer valueOf17 = Integer.valueOf(this.K ? 1 : 0);
            String str15 = this.L;
            csgg csggVar = this.M;
            Object valueOf18 = csggVar == null ? 0 : String.valueOf(csggVar.ordinal());
            aorb aorbVar = this.N;
            Object valueOf19 = aorbVar == null ? 0 : String.valueOf(aorbVar.a());
            String c = bdqb.c(this.O);
            cjwi cjwiVar = this.P;
            Object valueOf20 = cjwiVar == null ? 0 : String.valueOf(cjwiVar.a());
            cjwi cjwiVar2 = this.Q;
            Object valueOf21 = cjwiVar2 == null ? 0 : String.valueOf(cjwiVar2.a());
            cjwe cjweVar = this.R;
            Object valueOf22 = cjweVar == null ? 0 : String.valueOf(cjweVar.a());
            aqkt aqktVar = this.S;
            Object[] objArr = {b, obj, valueOf, valueOf2, str, str2, str3, str4, str5, valueOf3, str6, str7, str8, uri2, uri4, valueOf4, str9, valueOf5, valueOf6, valueOf7, valueOf8, str10, valueOf9, str11, valueOf10, valueOf11, str12, valueOf12, valueOf13, str13, valueOf14, str14, bArr, valueOf15, valueOf16, valueOf17, str15, valueOf18, valueOf19, c, valueOf20, valueOf21, valueOf22, aqktVar != null ? aqktVar.toByteArray() : null, Integer.valueOf(this.T ? 1 : 0)};
            sb.append('(');
            for (int i = 0; i < 45; i++) {
                Object obj2 = objArr[i];
                if (obj2 instanceof Number) {
                    sb.append(String.valueOf(obj2));
                } else {
                    if (obj2 instanceof String) {
                        String str16 = (String) obj2;
                        if (str16.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str16));
                        }
                    }
                    list.add(obj2);
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

        public final int k() {
            az(18, "color_palette_index");
            return this.s;
        }

        public final int l() {
            az(19, "color_type");
            return this.t;
        }

        public final int m() {
            az(20, "extended_color");
            return this.u;
        }

        public final int n() {
            az(29, "is_spam_source");
            return this.D;
        }

        public final int o() {
            az(25, "participant_type");
            return this.z;
        }

        public final int q() {
            az(4, "sim_slot_id");
            return this.e;
        }

        public final int r() {
            az(3, "sub_id");
            return this.d;
        }

        public final int s() {
            az(23, "subscription_color");
            return this.x;
        }

        public final int t() {
            az(26, "video_reachability");
            return this.A;
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ParticipantsTable -- REDACTED") : a();
        }

        public final long u() {
            az(16, "contact_id");
            return this.q;
        }

        public final long v() {
            az(34, "directory_id");
            return this.I;
        }

        public final Uri w() {
            az(15, "contact_photo_uri");
            return this.p;
        }

        public final Uri x() {
            az(14, "profile_photo_uri");
            return this.o;
        }

        public final aorb y() {
            az(39, "norm_ui_status");
            return this.N;
        }

        public final aqkt z() {
            az(44, "contact_metadata");
            return this.S;
        }

        protected BindData(Parcel parcel) {
            cjwi cjwiVar = cjwi.PROFILE_CONTACT_SOURCE;
            this.P = cjwiVar;
            this.Q = cjwiVar;
            this.R = cjwe.PREFER_PROFILE_PHOTO;
            aA(parcel);
        }
    }
}
