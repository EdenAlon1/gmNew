package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cqrs extends dtro implements dtrq {
    public MessageIdType a = bdhb.a;
    public String b;
    public cqtk c;
    public awvd d;
    public awvb e;
    public awvb f;
    public String g;
    public byte[] h;

    protected cqrs() {
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
        byte[] bArr = this.h;
        return String.format(locale, "FileTransferTable [message_id: %s,\n  transfer_id: %s,\n  transfer_type: %s,\n  attachment_upload_response: %s,\n  file_information: %s,\n  thumbnail_information: %s,\n  transfer_handle: %s,\n  opaque_data: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = cqtj.d().intValue();
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.a)));
        }
        dtub.u(contentValues, "transfer_id", this.b);
        cqtk cqtkVar = this.c;
        if (cqtkVar == null) {
            contentValues.putNull("transfer_type");
        } else {
            contentValues.put("transfer_type", Integer.valueOf(cqtkVar.ordinal()));
        }
        awvd awvdVar = this.d;
        if (awvdVar == null) {
            contentValues.putNull("attachment_upload_response");
        } else {
            contentValues.put("attachment_upload_response", awvdVar.toByteArray());
        }
        if (intValue >= 55030) {
            awvb awvbVar = this.e;
            if (awvbVar == null) {
                contentValues.putNull("file_information");
            } else {
                contentValues.put("file_information", awvbVar.toByteArray());
            }
        }
        if (intValue >= 59910) {
            awvb awvbVar2 = this.f;
            if (awvbVar2 == null) {
                contentValues.putNull("thumbnail_information");
            } else {
                contentValues.put("thumbnail_information", awvbVar2.toByteArray());
            }
        }
        if (intValue >= 55030) {
            dtub.u(contentValues, "transfer_handle", this.g);
        }
        if (intValue >= 56040) {
            contentValues.put("opaque_data", this.h);
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cqsy cqsyVar = (cqsy) ((cqsp) dtsuVar);
        aB();
        this.cL = cqsyVar.cU();
        if (cqsyVar.di(0)) {
            this.a = cqsyVar.h();
            fY(0);
        }
        if (cqsyVar.di(1)) {
            this.b = cqsyVar.k();
            fY(1);
        }
        if (cqsyVar.di(2)) {
            this.c = cqsyVar.i();
            fY(2);
        }
        if (cqsyVar.di(3)) {
            this.d = cqsyVar.g();
            fY(3);
        }
        if (cqsyVar.di(4)) {
            this.e = cqsyVar.e();
            fY(4);
        }
        if (cqsyVar.di(5)) {
            this.f = cqsyVar.f();
            fY(5);
        }
        if (cqsyVar.di(6)) {
            this.g = cqsyVar.j();
            fY(6);
        }
        if (cqsyVar.di(7)) {
            this.h = cqsyVar.l();
            fY(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cqrs)) {
            return false;
        }
        cqrs cqrsVar = (cqrs) obj;
        return super.aD(cqrsVar.cL) && Objects.equals(this.a, cqrsVar.a) && Objects.equals(this.b, cqrsVar.b) && this.c == cqrsVar.c && Objects.equals(this.d, cqrsVar.d) && Objects.equals(this.e, cqrsVar.e) && Objects.equals(this.f, cqrsVar.f) && Objects.equals(this.g, cqrsVar.g) && Arrays.equals(this.h, cqrsVar.h);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "file_transfer", dtub.m(new String[]{"message_id", "transfer_id", "transfer_type", "attachment_upload_response", "file_information", "thumbnail_information", "transfer_handle", "opaque_data"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "file_transfer";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        MessageIdType messageIdType = this.a;
        String str = this.b;
        cqtk cqtkVar = this.c;
        return Objects.hash(dtsqVar2, messageIdType, str, Integer.valueOf(cqtkVar == null ? 0 : cqtkVar.ordinal()), this.d, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h)), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new cqrr(this).get();
        String str = this.b;
        cqtk cqtkVar = this.c;
        Object valueOf = cqtkVar == null ? 0 : String.valueOf(cqtkVar.ordinal());
        awvd awvdVar = this.d;
        byte[] byteArray = awvdVar == null ? null : awvdVar.toByteArray();
        awvb awvbVar = this.e;
        byte[] byteArray2 = awvbVar == null ? null : awvbVar.toByteArray();
        awvb awvbVar2 = this.f;
        Object[] objArr = {obj, str, valueOf, byteArray, byteArray2, awvbVar2 != null ? awvbVar2.toByteArray() : null, this.g, this.h};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
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
        throw null;
    }

    public final awvb k() {
        az(4, "file_information");
        return this.e;
    }

    public final awvb l() {
        az(5, "thumbnail_information");
        return this.f;
    }

    public final awvd m() {
        az(3, "attachment_upload_response");
        return this.d;
    }

    public final MessageIdType n() {
        az(0, "message_id");
        return this.a;
    }

    public final cqtk o() {
        az(2, "transfer_type");
        return this.c;
    }

    public final String q() {
        az(6, "transfer_handle");
        return this.g;
    }

    public final String r() {
        az(1, "transfer_id");
        return this.b;
    }

    public final boolean s(final cqth cqthVar) {
        final dtve c = cqtj.c();
        return ((Boolean) c.q(new emyl() { // from class: cqro
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr = cqtj.a;
                cqtg cqtgVar = new cqtg();
                cqrs cqrsVar = cqrs.this;
                MessageIdType n = cqrsVar.n();
                if (n == null || n.equals(bdhb.a)) {
                    cqtgVar.a.putNull("message_id");
                } else {
                    cqtgVar.a.put("message_id", Long.valueOf(bdhb.a(n)));
                }
                dtub.u(cqtgVar.a, "transfer_id", cqrsVar.r());
                cqtk o = cqrsVar.o();
                if (o == null) {
                    cqtgVar.a.putNull("transfer_type");
                } else {
                    cqtgVar.a.put("transfer_type", Integer.valueOf(o.ordinal()));
                }
                cqtgVar.c(cqrsVar.m());
                awvb k = cqrsVar.k();
                int intValue = cqtj.d().intValue();
                int intValue2 = cqtj.d().intValue();
                if (intValue2 < 55030) {
                    dtub.w("file_information", intValue2);
                }
                if (intValue >= 55030) {
                    if (k == null) {
                        cqtgVar.a.putNull("file_information");
                    } else {
                        cqtgVar.a.put("file_information", k.toByteArray());
                    }
                }
                cqtgVar.d(cqrsVar.l());
                cqtgVar.e(cqrsVar.q());
                byte[] t = cqrsVar.t();
                int intValue3 = cqtj.d().intValue();
                int intValue4 = cqtj.d().intValue();
                if (intValue4 < 56040) {
                    dtub.w("opaque_data", intValue4);
                }
                if (intValue3 >= 56040) {
                    cqtgVar.a.put("opaque_data", t);
                }
                cqth cqthVar2 = cqthVar;
                cqtgVar.al();
                cqtgVar.af(cqthVar2);
                cqtgVar.an(new dtui("file_transfer", "-updateOrInsert-update"));
                if (cqtgVar.a().e() != 0) {
                    return true;
                }
                final dtve dtveVar = c;
                return Boolean.valueOf(dtub.b(cqtj.c(), "file_transfer", cqrsVar, new Function() { // from class: cqrp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.R("file_transfer", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: cqrq
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
    }

    public final byte[] t() {
        az(7, "opaque_data");
        return this.h;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "FileTransferTable -- REDACTED") : a();
    }
}
