package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
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
public class buco extends dtro implements dtrq {
    public long a;
    public MessageIdType b;
    public cmrf c;
    public MessageIdType d;
    public cmrv e;
    public cmrl f;
    public cmrl g;

    protected buco() {
        MessageIdType messageIdType = bdhb.a;
        this.b = messageIdType;
        this.d = messageIdType;
        this.e = cmrv.b(0);
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "MessageReactionsTable [_id: %s,\n  message_id: %s,\n  reactions_data: %s,\n  reacted_message_id: %s,\n  reaction: %s,\n  applied_reaction: %s,\n  animation_effect: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bueg.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        cmrf cmrfVar = this.c;
        if (cmrfVar == null) {
            contentValues.putNull("reactions_data");
        } else {
            contentValues.put("reactions_data", cmrfVar.toByteArray());
        }
        if (intValue >= 46020) {
            MessageIdType messageIdType2 = this.d;
            if (messageIdType2 == null || messageIdType2.equals(bdhb.a)) {
                contentValues.putNull("reacted_message_id");
            } else {
                contentValues.put("reacted_message_id", Long.valueOf(bdhb.a(this.d)));
            }
        }
        if (intValue >= 48000) {
            cmrv cmrvVar = this.e;
            if (cmrvVar == null) {
                contentValues.putNull("reaction");
            } else {
                contentValues.put("reaction", Integer.valueOf(cmrvVar.a()));
            }
        }
        if (intValue >= 59060) {
            cmrl cmrlVar = this.f;
            if (cmrlVar == null) {
                contentValues.putNull("applied_reaction");
            } else {
                contentValues.put("applied_reaction", cmrlVar.toByteArray());
            }
        }
        if (intValue >= 59520) {
            cmrl cmrlVar2 = this.g;
            if (cmrlVar2 == null) {
                contentValues.putNull("animation_effect");
            } else {
                contentValues.put("animation_effect", cmrlVar2.toByteArray());
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        budu buduVar = (budu) ((budm) dtsuVar);
        aB();
        this.cL = buduVar.cU();
        if (buduVar.di(0)) {
            this.a = buduVar.f();
            super.fY(0);
        }
        if (buduVar.di(1)) {
            this.b = buduVar.g();
            super.fY(1);
        }
        if (buduVar.di(2)) {
            this.c = buduVar.h();
            super.fY(2);
        }
        if (buduVar.di(3)) {
            this.d = buduVar.c();
            super.fY(3);
        }
        if (buduVar.di(4)) {
            this.e = buduVar.k();
            super.fY(4);
        }
        if (buduVar.di(5)) {
            this.f = buduVar.j();
            super.fY(5);
        }
        if (buduVar.di(6)) {
            this.g = buduVar.i();
            super.fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buco)) {
            return false;
        }
        buco bucoVar = (buco) obj;
        return super.aD(bucoVar.cL) && this.a == bucoVar.a && Objects.equals(this.b, bucoVar.b) && Objects.equals(this.c, bucoVar.c) && Objects.equals(this.d, bucoVar.d) && this.e == bucoVar.e && Objects.equals(this.f, bucoVar.f) && Objects.equals(this.g, bucoVar.g);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_reactions", dtub.m(new String[]{"message_id", "reactions_data", "reacted_message_id", "reaction", "applied_reaction", "animation_effect"}));
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
        return "message_reactions";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bucm(this).get();
        cmrf cmrfVar = this.c;
        byte[] byteArray = cmrfVar == null ? null : cmrfVar.toByteArray();
        Object obj2 = new bucn(this).get();
        cmrv cmrvVar = this.e;
        Object valueOf = cmrvVar == null ? 0 : String.valueOf(cmrvVar.a());
        cmrl cmrlVar = this.f;
        byte[] byteArray2 = cmrlVar == null ? null : cmrlVar.toByteArray();
        cmrl cmrlVar2 = this.g;
        Object[] objArr = {obj, byteArray, obj2, valueOf, byteArray2, cmrlVar2 != null ? cmrlVar2.toByteArray() : null};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj3);
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

    public final MessageIdType k() {
        az(1, "message_id");
        return this.b;
    }

    public final MessageIdType l() {
        az(3, "reacted_message_id");
        return this.d;
    }

    public final cmrf m() {
        az(2, "reactions_data");
        return this.c;
    }

    public final cmrl n() {
        az(5, "applied_reaction");
        return this.f;
    }

    public final cmrv o() {
        az(4, "reaction");
        return this.e;
    }

    public final /* synthetic */ void q(Long l) {
        if (l.longValue() >= 0) {
            this.a = new bucg(l).a.longValue();
            super.fY(0);
        }
    }

    public final /* synthetic */ void r(Long l) {
        if (l.longValue() >= 0) {
            this.a = new bucj(l).a.longValue();
            super.fY(0);
        }
    }

    public final void s() {
        final dtve b = bueg.b();
        dtub.b(bueg.b(), "message_reactions", this, new Function() { // from class: buck
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("message_reactions", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bucl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                buco.this.q((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageReactionsTable -- REDACTED") : a();
    }
}
