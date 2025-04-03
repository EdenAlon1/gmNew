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
public class bqeo extends dtro implements dtrq {
    public long a;
    public int d;
    public long f;
    public ConversationIdType b = bdgq.a;
    public aven c = aven.b(0);
    public avji e = avji.b(0);

    protected bqeo() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BusinessConversationsMetadataTable [_id: %s,\n  conversation_id: %s,\n  chatbot_directory_conversation_state: %s,\n  conversation_stop_state: %s,\n  conversation_toolstone_state: %s,\n  conversation_toolstone_timestamp_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bqfx.c().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.b)));
        }
        aven avenVar = this.c;
        if (avenVar == null) {
            contentValues.putNull("chatbot_directory_conversation_state");
        } else {
            contentValues.put("chatbot_directory_conversation_state", Integer.valueOf(avenVar.a()));
        }
        if (intValue >= 59010) {
            contentValues.put("conversation_stop_state", Integer.valueOf(this.d));
        }
        if (intValue >= 59050) {
            avji avjiVar = this.e;
            if (avjiVar == null) {
                contentValues.putNull("conversation_toolstone_state");
            } else {
                contentValues.put("conversation_toolstone_state", Integer.valueOf(avjiVar.a()));
            }
        }
        if (intValue >= 59050) {
            contentValues.put("conversation_toolstone_timestamp_ms", Long.valueOf(this.f));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bqfo bqfoVar = (bqfo) ((bqfh) dtsuVar);
        aB();
        this.cL = bqfoVar.cU();
        if (bqfoVar.di(0)) {
            this.a = bqfoVar.f();
            fY(0);
        }
        if (bqfoVar.di(1)) {
            this.b = bqfoVar.i();
            fY(1);
        }
        if (bqfoVar.di(2)) {
            this.c = bqfoVar.g();
            fY(2);
        }
        if (bqfoVar.di(3)) {
            this.d = bqfoVar.c();
            fY(3);
        }
        if (bqfoVar.di(4)) {
            this.e = bqfoVar.h();
            fY(4);
        }
        if (bqfoVar.di(5)) {
            this.f = bqfoVar.e();
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bqeo)) {
            return false;
        }
        bqeo bqeoVar = (bqeo) obj;
        return super.aD(bqeoVar.cL) && this.a == bqeoVar.a && Objects.equals(this.b, bqeoVar.b) && this.c == bqeoVar.c && this.d == bqeoVar.d && this.e == bqeoVar.e && this.f == bqeoVar.f;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "business_conversations_metadata", dtub.m(new String[]{"conversation_id", "chatbot_directory_conversation_state", "conversation_stop_state", "conversation_toolstone_state", "conversation_toolstone_timestamp_ms"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "business_conversations_metadata";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), this.e, Long.valueOf(this.f), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bqen(this).get();
        aven avenVar = this.c;
        Object valueOf = avenVar == null ? r3 : String.valueOf(avenVar.a());
        Integer valueOf2 = Integer.valueOf(this.d);
        avji avjiVar = this.e;
        Object[] objArr = {obj, valueOf, valueOf2, avjiVar != null ? String.valueOf(avjiVar.a()) : 0, Long.valueOf(this.f)};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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
        az(5, "conversation_toolstone_timestamp_ms");
        return this.f;
    }

    public final avji l() {
        az(4, "conversation_toolstone_state");
        return this.e;
    }

    public final void m() {
        final dtve b = bqfx.b();
        dtub.b(bqfx.b(), "business_conversations_metadata", this, new Function() { // from class: bqeg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("business_conversations_metadata", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bqeh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bqeo bqeoVar = bqeo.this;
                    bqeoVar.a = new bqed(l).a.longValue();
                    bqeoVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void n(Function function) {
        Object apply;
        String[] strArr = bqfx.a;
        apply = function.apply(new bqfw());
        final bqfv bqfvVar = new bqfv((bqfw) apply);
        final dtve b = bqfx.b();
        ((Boolean) b.q(new emyl() { // from class: bqee
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr2 = bqfx.a;
                bqfu bqfuVar = new bqfu();
                final bqeo bqeoVar = bqeo.this;
                bqeoVar.az(1, "conversation_id");
                ConversationIdType conversationIdType = bqeoVar.b;
                if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
                    bqfuVar.a.putNull("conversation_id");
                } else {
                    bqfuVar.a.put("conversation_id", Long.valueOf(bdgq.a(conversationIdType)));
                }
                bqeoVar.az(2, "chatbot_directory_conversation_state");
                bqfuVar.d(bqeoVar.c);
                bqeoVar.az(3, "conversation_stop_state");
                int i = bqeoVar.d;
                int intValue = bqfx.c().intValue();
                int intValue2 = bqfx.c().intValue();
                if (intValue2 < 59010) {
                    dtub.w("conversation_stop_state", intValue2);
                }
                if (intValue >= 59010) {
                    bqfuVar.a.put("conversation_stop_state", Integer.valueOf(i));
                }
                bqfv bqfvVar2 = bqfvVar;
                bqfuVar.e(bqeoVar.l());
                bqfuVar.f(bqeoVar.k());
                bqfuVar.al();
                bqfuVar.af(bqfvVar2);
                bqfuVar.an(new dtui("business_conversations_metadata", "-updateOrInsert-update"));
                if (bqfuVar.a().e() != 0) {
                    return true;
                }
                final dtve dtveVar = b;
                return Boolean.valueOf(dtub.b(bqfx.b(), "business_conversations_metadata", bqeoVar, new Function() { // from class: bqel
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.R("business_conversations_metadata", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Consumer() { // from class: bqem
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            bqeo bqeoVar2 = bqeo.this;
                            bqeoVar2.a = new bqef(l).a.longValue();
                            bqeoVar2.fY(0);
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BusinessConversationsMetadataTable -- REDACTED") : a();
    }
}
