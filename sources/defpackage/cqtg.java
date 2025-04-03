package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqtg extends duak {
    public cqtg() {
        super("file_transfer");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cqtf b() {
        ah();
        return new cqtf(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(awvd awvdVar) {
        if (awvdVar == null) {
            this.a.putNull("attachment_upload_response");
        } else {
            this.a.put("attachment_upload_response", awvdVar.toByteArray());
        }
    }

    public final void d(awvb awvbVar) {
        int intValue = cqtj.d().intValue();
        int intValue2 = cqtj.d().intValue();
        if (intValue2 < 59910) {
            dtub.w("thumbnail_information", intValue2);
        }
        if (intValue >= 59910) {
            if (awvbVar == null) {
                this.a.putNull("thumbnail_information");
            } else {
                this.a.put("thumbnail_information", awvbVar.toByteArray());
            }
        }
    }

    public final void e(String str) {
        int intValue = cqtj.d().intValue();
        int intValue2 = cqtj.d().intValue();
        if (intValue2 < 55030) {
            dtub.w("transfer_handle", intValue2);
        }
        if (intValue >= 55030) {
            dtub.u(this.a, "transfer_handle", str);
        }
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = cqtj.a;
        apply = function.apply(new cqti());
        af(new cqth((cqti) apply));
    }
}
