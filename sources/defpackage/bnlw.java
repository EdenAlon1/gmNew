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
public class bnlw extends dtro {
    public ParticipantsTable.BindData a;
    public PartsTable.BindData[] b;
    public bton c;
    public MessagesTable.BindData d;
    private String g;
    private String i;
    private String j;
    private String k;
    private String l;
    private String[] m;
    private String[] n;
    private Uri[] o;
    private String[] p;
    private String[] q;
    private long[] r;
    private long[] s;
    private String t;
    private String v;
    private String w;
    private MessageIdType e = bdhb.a;
    private long f = 0;
    private int h = -2;
    private long u = 0;
    private boolean x = false;

    protected bnlw() {
    }

    private final String[] f() {
        az(8, "_id");
        return this.m;
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageSnippetQuery [messages.messages__id: %s,\n  messages.messages_received_timestamp: %s,\n  participants.participants__id: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  parts.parts__id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_rowid: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_preview_failed: %s\n]\n", String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), aL(this.m), aL(this.n), aK(this.o), aL(this.p), aL(this.q), aJ(this.r), aJ(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        boao.b().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        int length;
        int length2;
        boaj boajVar = (boaj) dtsuVar;
        aB();
        this.cL = boajVar.cU();
        if (boajVar.di(0)) {
            this.e = new MessageIdType(boajVar.getLong(boajVar.cM(0, boao.a)));
            fY(0);
        }
        if (boajVar.di(1)) {
            this.f = boajVar.getLong(boajVar.cM(1, boao.a));
            fY(1);
        }
        if (boajVar.di(2)) {
            this.g = boajVar.getString(boajVar.cM(2, boao.a));
            fY(2);
        }
        if (boajVar.di(3)) {
            this.h = boajVar.getInt(boajVar.cM(3, boao.a));
            fY(3);
        }
        if (boajVar.di(4)) {
            this.i = cuxd.a(boajVar.getString(boajVar.cM(4, boao.a)));
            fY(4);
        }
        if (boajVar.di(5)) {
            this.j = cuxd.a(boajVar.getString(boajVar.cM(5, boao.a)));
            fY(5);
        }
        if (boajVar.di(6)) {
            this.k = cuxs.a(boajVar.getString(boajVar.cM(6, boao.a)));
            fY(6);
        }
        if (boajVar.di(7)) {
            this.l = cuxs.a(boajVar.getString(boajVar.cM(7, boao.a)));
            fY(7);
        }
        if (boajVar.di(8)) {
            this.m = (String[]) dtub.C(null, boaj.dt(boajVar.getString(boajVar.cM(8, boao.a))), new String[0]);
            fY(8);
        }
        if (boajVar.di(9)) {
            String[] dt = boaj.dt(boajVar.getString(boajVar.cM(9, boao.a)));
            for (int i = 0; i < dt.length; i++) {
                dt[i] = cuxs.a(dt[i]);
            }
            this.n = (String[]) dtub.C(null, dt, new String[0]);
            fY(9);
        }
        if (boajVar.di(10)) {
            String[] dt2 = boaj.dt(boajVar.getString(boajVar.cM(10, boao.a)));
            int length3 = dt2.length;
            Uri[] uriArr = new Uri[length3];
            int i2 = 0;
            int i3 = 0;
            while (i2 < length3) {
                String str = dt2[i2];
                int i4 = i3 + 1;
                uriArr[i3] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i2++;
                i3 = i4;
            }
            this.o = (Uri[]) dtub.C(null, uriArr, new Uri[0]);
            fY(10);
        }
        if (boajVar.di(11)) {
            this.p = (String[]) dtub.C(null, boaj.dt(boajVar.getString(boajVar.cM(11, boao.a))), new String[0]);
            fY(11);
        }
        if (boajVar.di(12)) {
            this.q = (String[]) dtub.C(null, boaj.dt(boajVar.getString(boajVar.cM(12, boao.a))), new String[0]);
            fY(12);
        }
        if (boajVar.di(13)) {
            this.r = dtub.B(null, boaj.ds(boajVar.getString(boajVar.cM(13, boao.a))));
            fY(13);
        }
        if (boajVar.di(14)) {
            this.s = dtub.B(null, boaj.ds(boajVar.getString(boajVar.cM(14, boao.a))));
            fY(14);
        }
        if (boajVar.di(15)) {
            this.t = boajVar.getString(boajVar.cM(15, boao.a));
            fY(15);
        }
        if (boajVar.di(16)) {
            this.u = boajVar.getLong(boajVar.cM(16, boao.a));
            fY(16);
        }
        if (boajVar.di(17)) {
            this.v = cuxs.a(boajVar.getString(boajVar.cM(17, boao.a)));
            fY(17);
        }
        if (boajVar.di(18)) {
            this.w = boajVar.getString(boajVar.cM(18, boao.a));
            fY(18);
        }
        if (boajVar.di(19)) {
            this.x = boajVar.getInt(boajVar.cM(19, boao.a)) == 1;
            fY(19);
        }
        int intValue = boao.b().intValue();
        buoy c = MessagesTable.c();
        az(0, "_id");
        c.v(this.e);
        az(1, "received_timestamp");
        c.Y(this.f);
        this.d = c.a();
        bvpo d = ParticipantsTable.d();
        az(2, "_id");
        d.v(this.g);
        az(3, "sub_id");
        d.T(this.h);
        az(4, "normalized_destination");
        d.I(this.i);
        az(5, "display_destination");
        d.q(this.j);
        az(6, "full_name");
        d.u(this.k);
        az(7, "first_name");
        d.t(this.l);
        this.a = d.a();
        ArrayList arrayList = new ArrayList();
        boolean s = dtub.c.s();
        long[] jArr = s ? this.s : null;
        if (s) {
            if (jArr != null && (length2 = jArr.length) != 0 && (length2 != 1 || jArr[0] != 0)) {
                length = f().length;
            }
            length = 0;
        } else {
            if (f() != null) {
                length = f().length;
            }
            length = 0;
        }
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < length; i5++) {
            if (s) {
                long j = jArr[i5];
                if (j != 0) {
                    Long valueOf = Long.valueOf(j);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                    }
                }
            }
            bvwp b = PartsTable.b();
            b.B(f()[i5]);
            az(9, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            b.Y(this.n[i5]);
            az(10, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            b.aa(this.o[i5]);
            az(11, "content_type");
            b.t(this.p[i5]);
            if (intValue >= 26000) {
                az(12, "file_name");
                b.y(this.q[i5]);
            }
            if (intValue >= 26040) {
                az(13, "duration");
                b.v(this.r[i5]);
            }
            arrayList.add(b.a());
        }
        this.b = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[0]);
        btor a = btqq.a();
        az(15, "trigger_url");
        a.n(this.t);
        az(16, "expiration_time_millis");
        a.e(this.u);
        az(17, "link_title");
        a.l(this.v);
        az(18, "link_image_url");
        a.i(this.w);
        if (intValue >= 22020) {
            az(19, "link_preview_failed");
            a.j(this.x);
        }
        this.c = a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnlw)) {
            return false;
        }
        bnlw bnlwVar = (bnlw) obj;
        return super.aD(bnlwVar.cL) && Objects.equals(this.e, bnlwVar.e) && this.f == bnlwVar.f && Objects.equals(this.g, bnlwVar.g) && this.h == bnlwVar.h && Objects.equals(this.i, bnlwVar.i) && Objects.equals(this.j, bnlwVar.j) && Objects.equals(this.k, bnlwVar.k) && Objects.equals(this.l, bnlwVar.l) && Arrays.equals(this.m, bnlwVar.m) && Arrays.equals(this.n, bnlwVar.n) && Arrays.equals(this.o, bnlwVar.o) && Arrays.equals(this.p, bnlwVar.p) && Arrays.equals(this.q, bnlwVar.q) && Arrays.equals(this.r, bnlwVar.r) && Arrays.equals(this.s, bnlwVar.s) && Objects.equals(this.t, bnlwVar.t) && this.u == bnlwVar.u && Objects.equals(this.v, bnlwVar.v) && Objects.equals(this.w, bnlwVar.w) && this.x == bnlwVar.x;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.e, Long.valueOf(this.f), this.g, Integer.valueOf(this.h), this.i, this.j, this.k, this.l, Integer.valueOf(Arrays.hashCode(this.m)), Integer.valueOf(Arrays.hashCode(this.n)), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(Arrays.hashCode(this.p)), Integer.valueOf(Arrays.hashCode(this.q)), Integer.valueOf(Arrays.hashCode(this.r)), Integer.valueOf(Arrays.hashCode(this.s)), this.t, Long.valueOf(this.u), this.v, this.w, Boolean.valueOf(this.x), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageSnippetQuery -- REDACTED") : a();
    }
}
