package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bswn extends dtro implements dtrq {
    public String b;
    public ydv c;
    public String d;
    public String f;
    public ConversationIdType a = bdgq.a;
    public boolean e = false;
    public boolean g = false;

    protected bswn() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "DraftsTable [conversation_id: %s,\n  text: %s,\n  attachments: %s,\n  subject: %s,\n  is_urgent: %s,\n  replied_to_message_id: %s,\n  is_encrypted: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bsyb.c().intValue();
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.a)));
        }
        dtub.u(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.b);
        if (intValue >= 59420) {
            ydv ydvVar = this.c;
            if (ydvVar == null) {
                contentValues.putNull("attachments");
            } else {
                contentValues.put("attachments", ydvVar.toByteArray());
            }
        }
        if (intValue >= 59170) {
            dtub.u(contentValues, "subject", this.d);
        }
        if (intValue >= 59170) {
            contentValues.put("is_urgent", Boolean.valueOf(this.e));
        }
        if (intValue >= 59540) {
            dtub.u(contentValues, "replied_to_message_id", this.f);
        }
        if (intValue >= 59720) {
            contentValues.put("is_encrypted", Boolean.valueOf(this.g));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bsxq bsxqVar = (bsxq) ((bsxi) dtsuVar);
        aB();
        this.cL = bsxqVar.cU();
        if (bsxqVar.di(0)) {
            this.a = bsxqVar.e();
            fY(0);
        }
        if (bsxqVar.di(1)) {
            this.b = bsxqVar.h();
            fY(1);
        }
        if (bsxqVar.di(2)) {
            this.c = bsxqVar.c();
            fY(2);
        }
        if (bsxqVar.di(3)) {
            this.d = bsxqVar.g();
            fY(3);
        }
        if (bsxqVar.di(4)) {
            this.e = bsxqVar.j();
            fY(4);
        }
        if (bsxqVar.di(5)) {
            this.f = bsxqVar.f();
            fY(5);
        }
        if (bsxqVar.di(6)) {
            this.g = bsxqVar.i();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bswn)) {
            return false;
        }
        bswn bswnVar = (bswn) obj;
        return super.aD(bswnVar.cL) && Objects.equals(this.a, bswnVar.a) && Objects.equals(this.b, bswnVar.b) && Objects.equals(this.c, bswnVar.c) && Objects.equals(this.d, bswnVar.d) && this.e == bswnVar.e && Objects.equals(this.f, bswnVar.f) && this.g == bswnVar.g;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "drafts", dtub.m(new String[]{"conversation_id", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "attachments", "subject", "is_urgent", "replied_to_message_id", "is_encrypted"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "drafts";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bswm(this).get();
        String str = this.b;
        ydv ydvVar = this.c;
        Object[] objArr = {obj, str, ydvVar == null ? null : ydvVar.toByteArray(), this.d, Integer.valueOf(this.e ? 1 : 0), this.f, Integer.valueOf(this.g ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 7; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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
        return k(5);
    }

    @Deprecated
    public final Long k(final int i) {
        final dtve b = bsyb.b();
        return Long.valueOf(dtub.b(bsyb.b(), "drafts", this, new Function() { // from class: bswi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.T("drafts", (ContentValues) obj, i));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bswj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final /* synthetic */ elfl l() {
        Object obj;
        Callable callable = new Callable() { // from class: dtrp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dtrq.this.j();
            }
        };
        obj = ((dtqv) dtub.c).i.get();
        return elfo.g(callable, (Executor) obj);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "DraftsTable -- REDACTED") : a();
    }
}
