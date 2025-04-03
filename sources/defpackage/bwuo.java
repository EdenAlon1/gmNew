package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.Optional;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwuo extends dtro implements dtrq {
    public String a;
    public long c;
    public MessageIdType b = bdhb.a;
    public long d = 0;
    public long e = 0;
    public Optional f = bdhe.b(-1);

    protected bwuo() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ReadReportsTable [_id: %s,\n  message_id: %s,\n  participant_id: %s,\n  receive_time: %s,\n  read_time: %s,\n  ftd_time: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bwvy.d().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        dtub.t(contentValues, "participant_id", this.c);
        contentValues.put("receive_time", Long.valueOf(this.d));
        contentValues.put("read_time", Long.valueOf(this.e));
        if (intValue >= 58880) {
            Optional optional = this.f;
            if (optional == null) {
                contentValues.putNull("ftd_time");
            } else {
                contentValues.put("ftd_time", Long.valueOf(bdhe.a(optional)));
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bwvp bwvpVar = (bwvp) ((bwvi) dtsuVar);
        aB();
        this.cL = bwvpVar.cU();
        if (bwvpVar.di(0)) {
            this.a = bwvpVar.i();
            super.fY(0);
        }
        if (bwvpVar.di(1)) {
            this.b = bwvpVar.g();
            super.fY(1);
        }
        if (bwvpVar.di(2)) {
            this.c = bwvpVar.c();
            super.fY(2);
        }
        if (bwvpVar.di(3)) {
            this.d = bwvpVar.f();
            super.fY(3);
        }
        if (bwvpVar.di(4)) {
            this.e = bwvpVar.e();
            super.fY(4);
        }
        if (bwvpVar.di(5)) {
            this.f = bwvpVar.h();
            super.fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwuo)) {
            return false;
        }
        bwuo bwuoVar = (bwuo) obj;
        return super.aD(bwuoVar.cL) && Objects.equals(this.a, bwuoVar.a) && Objects.equals(this.b, bwuoVar.b) && this.c == bwuoVar.c && this.d == bwuoVar.d && this.e == bwuoVar.e && Objects.equals(this.f, bwuoVar.f);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "read_reports", dtub.m(new String[]{"message_id", "participant_id", "receive_time", "read_time", "ftd_time"}));
    }

    @Override // defpackage.dtro
    public final void fY(int i) {
        super.fY(0);
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "read_reports";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bwun(this).get(), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(bdhe.a(this.f))};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
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

    public final long k() {
        az(2, "participant_id");
        return this.c;
    }

    public final long l() {
        az(4, "read_time");
        return this.e;
    }

    public final long m() {
        az(3, "receive_time");
        return this.d;
    }

    public final MessageIdType n() {
        az(1, "message_id");
        return this.b;
    }

    public final bwuq o() {
        bwur bwurVar = new bwur();
        BitSet bitSet = this.cJ;
        bwurVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
        BitSet bitSet2 = bwurVar.az;
        if (bitSet2 == null || bitSet2.get(0)) {
            az(0, "_id");
            bwurVar.a = this.a;
        }
        BitSet bitSet3 = bwurVar.az;
        if (bitSet3 == null || bitSet3.get(1)) {
            bwurVar.b = n();
        }
        BitSet bitSet4 = bwurVar.az;
        if (bitSet4 == null || bitSet4.get(2)) {
            bwurVar.c = k();
        }
        BitSet bitSet5 = bwurVar.az;
        if (bitSet5 == null || bitSet5.get(3)) {
            bwurVar.d = m();
        }
        BitSet bitSet6 = bwurVar.az;
        if (bitSet6 == null || bitSet6.get(4)) {
            bwurVar.e = l();
        }
        BitSet bitSet7 = bwurVar.az;
        if (bitSet7 != null && !bitSet7.get(5)) {
            return bwurVar;
        }
        bwurVar.f = q();
        return bwurVar;
    }

    public final Optional q() {
        az(5, "ftd_time");
        return this.f;
    }

    public final /* synthetic */ void r(final Long l) {
        if (l.longValue() >= 0) {
            this.a = (String) new dtuj() { // from class: bwuh
                @Override // defpackage.dtuj
                public final Object a() {
                    return String.valueOf(l);
                }
            }.a();
            super.fY(0);
        }
    }

    public final /* synthetic */ void s(final Long l) {
        if (l.longValue() >= 0) {
            this.a = (String) new dtuj() { // from class: bwui
                @Override // defpackage.dtuj
                public final Object a() {
                    return String.valueOf(l);
                }
            }.a();
            super.fY(0);
        }
    }

    public final /* synthetic */ void t(final Long l) {
        if (l.longValue() >= 0) {
            this.a = (String) new dtuj() { // from class: bwug
                @Override // defpackage.dtuj
                public final Object a() {
                    return String.valueOf(l);
                }
            }.a();
            super.fY(0);
        }
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ReadReportsTable -- REDACTED") : a();
    }
}
