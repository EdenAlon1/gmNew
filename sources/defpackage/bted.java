package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bted extends dtro implements dtrq {
    public long a;
    public byyx c;
    public long d;
    public MessageIdType b = bdhb.a;
    public boolean e = false;
    public Duration f = bdgu.b(0);

    protected bted() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "FlaggedMessagesTable [_id: %s,\n  flagged_message_id: %s,\n  flagging_reason: %s,\n  flagged_message_timestamp: %s,\n  flagged_message_notified: %s,\n  flagged_message_delay: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = btfo.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("flagged_message_id");
        } else {
            contentValues.put("flagged_message_id", Long.valueOf(bdhb.a(this.b)));
        }
        byyx byyxVar = this.c;
        if (byyxVar == null) {
            contentValues.putNull("flagging_reason");
        } else {
            contentValues.put("flagging_reason", Integer.valueOf(byyxVar.ordinal()));
        }
        if (intValue >= 39030) {
            contentValues.put("flagged_message_timestamp", Long.valueOf(this.d));
        }
        if (intValue >= 46030) {
            contentValues.put("flagged_message_notified", Boolean.valueOf(this.e));
        }
        if (intValue >= 60710) {
            Duration duration = this.f;
            if (duration == null) {
                contentValues.putNull("flagged_message_delay");
            } else {
                contentValues.put("flagged_message_delay", Long.valueOf(bdgu.a(duration)));
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btfd btfdVar = (btfd) ((btew) dtsuVar);
        aB();
        this.cL = btfdVar.cU();
        if (btfdVar.di(0)) {
            this.a = btfdVar.e();
            fY(0);
        }
        if (btfdVar.di(1)) {
            this.b = btfdVar.f();
            fY(1);
        }
        if (btfdVar.di(2)) {
            this.c = btfdVar.g();
            fY(2);
        }
        if (btfdVar.di(3)) {
            this.d = btfdVar.c();
            fY(3);
        }
        if (btfdVar.di(4)) {
            this.e = btfdVar.i();
            fY(4);
        }
        if (btfdVar.di(5)) {
            this.f = btfdVar.h();
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bted)) {
            return false;
        }
        bted btedVar = (bted) obj;
        return super.aD(btedVar.cL) && this.a == btedVar.a && Objects.equals(this.b, btedVar.b) && this.c == btedVar.c && this.d == btedVar.d && this.e == btedVar.e && Objects.equals(this.f, btedVar.f);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "flagged_messages", dtub.m(new String[]{"flagged_message_id", "flagging_reason", "flagged_message_timestamp", "flagged_message_notified", "flagged_message_delay"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "flagged_messages";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        MessageIdType messageIdType = this.b;
        byyx byyxVar = this.c;
        return Objects.hash(dtsqVar2, valueOf, messageIdType, Integer.valueOf(byyxVar == null ? 0 : byyxVar.ordinal()), Long.valueOf(this.d), Boolean.valueOf(this.e), this.f, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new btec(this).get();
        byyx byyxVar = this.c;
        Object[] objArr = {obj, byyxVar == null ? 0 : String.valueOf(byyxVar.ordinal()), Long.valueOf(this.d), Integer.valueOf(this.e ? 1 : 0), Long.valueOf(bdgu.a(this.f))};
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
        az(3, "flagged_message_timestamp");
        return this.d;
    }

    public final MessageIdType l() {
        az(1, "flagged_message_id");
        return this.b;
    }

    public final byyx m() {
        az(2, "flagging_reason");
        return this.c;
    }

    public final Duration n() {
        az(5, "flagged_message_delay");
        return this.f;
    }

    @Deprecated
    public final Long o() {
        final dtve b = btfo.b();
        return Long.valueOf(dtub.b(btfo.b(), "flagged_messages", this, new Function() { // from class: btdz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("flagged_messages", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btea
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bted btedVar = bted.this;
                    btedVar.a = new bteb(l).a.longValue();
                    btedVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final boolean q() {
        az(4, "flagged_message_notified");
        return this.e;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "FlaggedMessagesTable -- REDACTED") : a();
    }
}
