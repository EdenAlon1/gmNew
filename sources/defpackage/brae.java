package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brae extends dtro implements dtrq {
    public long a;
    public String e;
    public ConversationIdType b = bdgq.a;
    public axcl c = axcl.CONVERSATION_CLASSIFICATION_TYPE_UNSPECIFIED;
    public axcj d = axcj.CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED;
    public long f = 0;
    public long g = 0;

    protected brae() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationClassificationsTable [_id: %s,\n  conversation_id: %s,\n  classification_type: %s,\n  classification_state: %s,\n  date: %s,\n  impression_count: %s,\n  generated_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = brbs.c().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.b)));
        }
        axcl axclVar = this.c;
        if (axclVar == null) {
            contentValues.putNull("classification_type");
        } else {
            contentValues.put("classification_type", Integer.valueOf(axclVar.a()));
        }
        if (intValue >= 58690) {
            axcj axcjVar = this.d;
            if (axcjVar == null) {
                contentValues.putNull("classification_state");
            } else {
                contentValues.put("classification_state", Integer.valueOf(axcjVar.a()));
            }
        }
        dtub.u(contentValues, "date", this.e);
        if (intValue >= 58840) {
            contentValues.put("impression_count", Long.valueOf(this.f));
        }
        if (intValue >= 58840) {
            contentValues.put("generated_timestamp", Long.valueOf(this.g));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        brbh brbhVar = (brbh) ((braz) dtsuVar);
        aB();
        this.cL = brbhVar.cU();
        if (brbhVar.di(0)) {
            this.a = brbhVar.f();
            fY(0);
        }
        if (brbhVar.di(1)) {
            this.b = brbhVar.j();
            fY(1);
        }
        if (brbhVar.di(2)) {
            this.c = brbhVar.i();
            fY(2);
        }
        if (brbhVar.di(3)) {
            this.d = brbhVar.h();
            fY(3);
        }
        if (brbhVar.di(4)) {
            this.e = brbhVar.k();
            fY(4);
        }
        if (brbhVar.di(5)) {
            this.f = brbhVar.g();
            fY(5);
        }
        if (brbhVar.di(6)) {
            this.g = brbhVar.e();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brae)) {
            return false;
        }
        brae braeVar = (brae) obj;
        return super.aD(braeVar.cL) && this.a == braeVar.a && Objects.equals(this.b, braeVar.b) && this.c == braeVar.c && this.d == braeVar.d && Objects.equals(this.e, braeVar.e) && this.f == braeVar.f && this.g == braeVar.g;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_classifications_table", dtub.m(new String[]{"conversation_id", "classification_type", "classification_state", "date", "impression_count", "generated_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversation_classifications_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, this.e, Long.valueOf(this.f), Long.valueOf(this.g), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new brad(this).get();
        axcl axclVar = this.c;
        Object valueOf = axclVar == null ? r3 : String.valueOf(axclVar.a());
        axcj axcjVar = this.d;
        Object[] objArr = {obj, valueOf, axcjVar != null ? String.valueOf(axcjVar.a()) : 0, this.e, Long.valueOf(this.f), Long.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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
        az(5, "impression_count");
        return this.f;
    }

    public final axcj l() {
        az(3, "classification_state");
        return this.d;
    }

    public final axcl m() {
        az(2, "classification_type");
        return this.c;
    }

    public final String n() {
        az(4, "date");
        return this.e;
    }

    public final boolean o(final brbq brbqVar) {
        final dtve b = brbs.b();
        return ((Boolean) b.q(new emyl() { // from class: braa
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr = brbs.a;
                brbp brbpVar = new brbp();
                final brae braeVar = brae.this;
                braeVar.az(1, "conversation_id");
                ConversationIdType conversationIdType = braeVar.b;
                if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
                    brbpVar.a.putNull("conversation_id");
                } else {
                    brbpVar.a.put("conversation_id", Long.valueOf(bdgq.a(conversationIdType)));
                }
                brbpVar.d(braeVar.m());
                brbpVar.c(braeVar.l());
                dtub.u(brbpVar.a, "date", braeVar.n());
                brbpVar.e(braeVar.k());
                braeVar.az(6, "generated_timestamp");
                long j = braeVar.g;
                int intValue = brbs.c().intValue();
                int intValue2 = brbs.c().intValue();
                if (intValue2 < 58840) {
                    dtub.w("generated_timestamp", intValue2);
                }
                if (intValue >= 58840) {
                    brbpVar.a.put("generated_timestamp", Long.valueOf(j));
                }
                brbq brbqVar2 = brbqVar;
                brbpVar.al();
                brbpVar.af(brbqVar2);
                brbpVar.an(new dtui("conversation_classifications_table", "-updateOrInsert-update"));
                if (brbpVar.a().e() != 0) {
                    return true;
                }
                final dtve dtveVar = b;
                return Boolean.valueOf(dtub.b(brbs.b(), "conversation_classifications_table", braeVar, new Function() { // from class: brac
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.R("conversation_classifications_table", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: bqzz
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            brae braeVar2 = brae.this;
                            braeVar2.a = new brab(l).a.longValue();
                            braeVar2.fY(0);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationClassificationsTable -- REDACTED") : a();
    }
}
