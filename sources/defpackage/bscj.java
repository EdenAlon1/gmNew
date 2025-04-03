package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bscj extends dtro<bsdb, bsdl, bsdm, bscj, bsda> implements dtrq<Long> {
    public long b;
    public ConversationIdType a = bdgq.a;
    public awwp c = awwp.UNKNOWN_STATE;
    public bdpy d = bdqb.b();

    protected bscj() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationToParticipantsTable [conversation_id: %s,\n  participant_id: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.a)));
        }
        dtub.t(contentValues, "participant_id", this.b);
        awwp awwpVar = this.c;
        if (awwpVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(awwpVar.e));
        }
        bdpy bdpyVar = this.d;
        if (bdpyVar == null) {
            contentValues.putNull("last_modified_by_key");
        } else {
            contentValues.put("last_modified_by_key", bdqb.c(bdpyVar));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bsdg bsdgVar = (bsdg) ((bsdb) dtsuVar);
        aB();
        this.cL = bsdgVar.cU();
        if (bsdgVar.di(0)) {
            this.a = bsdgVar.e();
            fY(0);
        }
        if (bsdgVar.di(1)) {
            this.b = bsdgVar.c();
            fY(1);
        }
        if (bsdgVar.di(2)) {
            this.c = bsdgVar.f();
            fY(2);
        }
        if (bsdgVar.di(3)) {
            this.d = bsdgVar.g();
            fY(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bscj)) {
            return false;
        }
        bscj bscjVar = (bscj) obj;
        return super.aD(bscjVar.cL) && Objects.equals(this.a, bscjVar.a) && this.b == bscjVar.b && this.c == bscjVar.c && Objects.equals(this.d, bscjVar.d);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_to_participants", dtub.m(new String[]{"conversation_id", "participant_id", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversation_to_participants";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Long.valueOf(this.b), this.c, this.d, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bsci(this).get();
        Long valueOf = Long.valueOf(this.b);
        awwp awwpVar = this.c;
        Object[] objArr = {obj, valueOf, awwpVar == null ? 0 : String.valueOf(awwpVar.e), bdqb.c(this.d)};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj2);
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
        az(1, "participant_id");
        return this.b;
    }

    public final awwp l() {
        az(2, "rcs_group_join_status");
        return this.c;
    }

    public final ConversationIdType m() {
        az(0, "conversation_id");
        return this.a;
    }

    public final bdpy n() {
        az(3, "last_modified_by_key");
        return this.d;
    }

    public final bscn o() {
        bsco bscoVar = new bsco();
        BitSet bitSet = this.cJ;
        bscoVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
        BitSet bitSet2 = bscoVar.az;
        if (bitSet2 == null || bitSet2.get(0)) {
            bscoVar.a = m();
        }
        BitSet bitSet3 = bscoVar.az;
        if (bitSet3 == null || bitSet3.get(1)) {
            bscoVar.b = k();
        }
        BitSet bitSet4 = bscoVar.az;
        if (bitSet4 == null || bitSet4.get(2)) {
            bscoVar.c = l();
        }
        BitSet bitSet5 = bscoVar.az;
        if (bitSet5 != null && !bitSet5.get(3)) {
            return bscoVar;
        }
        bscoVar.d = n();
        return bscoVar;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationToParticipantsTable -- REDACTED") : a();
    }
}
