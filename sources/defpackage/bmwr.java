package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dtro;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmwr extends dtro {
    public MessageIdType a;
    public MessageIdType b;
    public long c;
    public MessagesTable.BindData d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public ParticipantsTable.BindData k;
    public String[] l;
    public String[] m;
    public Uri[] n;
    public String[] o;
    public String[] p;
    public long[] q;
    public long[] r;
    public PartsTable.BindData[] s;
    public String t;
    public long u;
    public String v;
    public String w;
    public boolean x;
    public bton y;

    protected bmwr() {
        MessageIdType messageIdType = bdhb.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = 0L;
        this.f = -2;
        this.u = 0L;
        this.x = false;
    }

    private final String[] h() {
        az(9, "_id");
        return this.l;
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageRepliesView [message_replies.message_replies_message_id: %s,\n  messages.messages__id: %s,\n  messages.messages_received_timestamp: %s,\n  participants.participants__id: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  parts.parts__id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_rowid: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_preview_failed: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), aL(this.l), aL(this.m), aK(this.n), aL(this.o), aL(this.p), aJ(this.q), aJ(this.r), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bnlv.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bnls bnlsVar = (bnls) dtsuVar;
        aB();
        this.cL = bnlsVar.cU();
        if (bnlsVar.di(0)) {
            this.a = new MessageIdType(bnlsVar.getLong(bnlsVar.cM(0, bnlv.a)));
            fY(0);
        }
        if (bnlsVar.di(1)) {
            this.b = new MessageIdType(bnlsVar.getLong(bnlsVar.cM(1, bnlv.a)));
            fY(1);
        }
        if (bnlsVar.di(2)) {
            this.c = bnlsVar.getLong(bnlsVar.cM(2, bnlv.a));
            fY(2);
        }
        if (bnlsVar.di(3)) {
            this.e = bnlsVar.getString(bnlsVar.cM(3, bnlv.a));
            fY(3);
        }
        if (bnlsVar.di(4)) {
            this.f = bnlsVar.getInt(bnlsVar.cM(4, bnlv.a));
            fY(4);
        }
        if (bnlsVar.di(5)) {
            this.g = cuxd.a(bnlsVar.getString(bnlsVar.cM(5, bnlv.a)));
            fY(5);
        }
        if (bnlsVar.di(6)) {
            this.h = cuxd.a(bnlsVar.getString(bnlsVar.cM(6, bnlv.a)));
            fY(6);
        }
        if (bnlsVar.di(7)) {
            this.i = cuxs.a(bnlsVar.getString(bnlsVar.cM(7, bnlv.a)));
            fY(7);
        }
        if (bnlsVar.di(8)) {
            this.j = cuxs.a(bnlsVar.getString(bnlsVar.cM(8, bnlv.a)));
            fY(8);
        }
        if (bnlsVar.di(9)) {
            this.l = (String[]) dtub.C(null, bnls.dt(bnlsVar.getString(bnlsVar.cM(9, bnlv.a))), new String[0]);
            fY(9);
        }
        if (bnlsVar.di(10)) {
            String[] dt = bnls.dt(bnlsVar.getString(bnlsVar.cM(10, bnlv.a)));
            for (int i = 0; i < dt.length; i++) {
                dt[i] = cuxs.a(dt[i]);
            }
            this.m = (String[]) dtub.C(null, dt, new String[0]);
            fY(10);
        }
        if (bnlsVar.di(11)) {
            String[] dt2 = bnls.dt(bnlsVar.getString(bnlsVar.cM(11, bnlv.a)));
            int length = dt2.length;
            Uri[] uriArr = new Uri[length];
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                String str = dt2[i2];
                int i4 = i3 + 1;
                uriArr[i3] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i2++;
                i3 = i4;
            }
            this.n = (Uri[]) dtub.C(null, uriArr, new Uri[0]);
            fY(11);
        }
        if (bnlsVar.di(12)) {
            this.o = (String[]) dtub.C(null, bnls.dt(bnlsVar.getString(bnlsVar.cM(12, bnlv.a))), new String[0]);
            fY(12);
        }
        if (bnlsVar.di(13)) {
            this.p = (String[]) dtub.C(null, bnls.dt(bnlsVar.getString(bnlsVar.cM(13, bnlv.a))), new String[0]);
            fY(13);
        }
        if (bnlsVar.di(14)) {
            this.q = dtub.B(null, bnls.ds(bnlsVar.getString(bnlsVar.cM(14, bnlv.a))));
            fY(14);
        }
        if (bnlsVar.di(15)) {
            this.r = dtub.B(null, bnls.ds(bnlsVar.getString(bnlsVar.cM(15, bnlv.a))));
            fY(15);
        }
        if (bnlsVar.di(16)) {
            this.t = bnlsVar.getString(bnlsVar.cM(16, bnlv.a));
            fY(16);
        }
        if (bnlsVar.di(17)) {
            this.u = bnlsVar.getLong(bnlsVar.cM(17, bnlv.a));
            fY(17);
        }
        if (bnlsVar.di(18)) {
            this.v = cuxs.a(bnlsVar.getString(bnlsVar.cM(18, bnlv.a)));
            fY(18);
        }
        if (bnlsVar.di(19)) {
            this.w = bnlsVar.getString(bnlsVar.cM(19, bnlv.a));
            fY(19);
        }
        if (bnlsVar.di(20)) {
            this.x = bnlsVar.getInt(bnlsVar.cM(20, bnlv.a)) == 1;
            fY(20);
        }
        g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmwr)) {
            return false;
        }
        bmwr bmwrVar = (bmwr) obj;
        return super.aD(bmwrVar.cL) && Objects.equals(this.a, bmwrVar.a) && Objects.equals(this.b, bmwrVar.b) && this.c == bmwrVar.c && Objects.equals(this.e, bmwrVar.e) && this.f == bmwrVar.f && Objects.equals(this.g, bmwrVar.g) && Objects.equals(this.h, bmwrVar.h) && Objects.equals(this.i, bmwrVar.i) && Objects.equals(this.j, bmwrVar.j) && Arrays.equals(this.l, bmwrVar.l) && Arrays.equals(this.m, bmwrVar.m) && Arrays.equals(this.n, bmwrVar.n) && Arrays.equals(this.o, bmwrVar.o) && Arrays.equals(this.p, bmwrVar.p) && Arrays.equals(this.q, bmwrVar.q) && Arrays.equals(this.r, bmwrVar.r) && Objects.equals(this.t, bmwrVar.t) && this.u == bmwrVar.u && Objects.equals(this.v, bmwrVar.v) && Objects.equals(this.w, bmwrVar.w) && this.x == bmwrVar.x;
    }

    public final MessageIdType f() {
        az(0, "message_id");
        return this.a;
    }

    public final void g() {
        int length;
        int length2;
        int intValue = bnlv.c().intValue();
        buoy c = MessagesTable.c();
        az(1, "_id");
        c.v(this.b);
        az(2, "received_timestamp");
        c.Y(this.c);
        this.d = c.a();
        bvpo d = ParticipantsTable.d();
        az(3, "_id");
        d.v(this.e);
        az(4, "sub_id");
        d.T(this.f);
        az(5, "normalized_destination");
        d.I(this.g);
        az(6, "display_destination");
        d.q(this.h);
        az(7, "full_name");
        d.u(this.i);
        az(8, "first_name");
        d.t(this.j);
        this.k = d.a();
        ArrayList arrayList = new ArrayList();
        boolean s = dtub.c.s();
        long[] jArr = s ? this.r : null;
        if (s) {
            if (jArr != null && (length2 = jArr.length) != 0 && (length2 != 1 || jArr[0] != 0)) {
                length = h().length;
            }
            length = 0;
        } else {
            if (h() != null) {
                length = h().length;
            }
            length = 0;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < length; i++) {
            if (s) {
                long j = jArr[i];
                if (j != 0) {
                    Long valueOf = Long.valueOf(j);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                    }
                }
            }
            bvwp b = PartsTable.b();
            b.B(h()[i]);
            az(10, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            b.Y(this.m[i]);
            az(11, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            b.aa(this.n[i]);
            az(12, "content_type");
            b.t(this.o[i]);
            if (intValue >= 26000) {
                az(13, "file_name");
                b.y(this.p[i]);
            }
            if (intValue >= 26040) {
                az(14, "duration");
                b.v(this.q[i]);
            }
            arrayList.add(b.a());
        }
        this.s = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[0]);
        btor a = btqq.a();
        az(16, "trigger_url");
        a.n(this.t);
        az(17, "expiration_time_millis");
        a.e(this.u);
        az(18, "link_title");
        a.l(this.v);
        az(19, "link_image_url");
        a.i(this.w);
        if (intValue >= 22020) {
            az(20, "link_preview_failed");
            a.j(this.x);
        }
        this.y = a.a();
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Long.valueOf(this.c), this.e, Integer.valueOf(this.f), this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.l)), Integer.valueOf(Arrays.hashCode(this.m)), Integer.valueOf(Arrays.hashCode(this.n)), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(Arrays.hashCode(this.p)), Integer.valueOf(Arrays.hashCode(this.q)), Integer.valueOf(Arrays.hashCode(this.r)), this.t, Long.valueOf(this.u), this.v, this.w, Boolean.valueOf(this.x), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageRepliesView -- REDACTED") : a();
    }
}
