package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ron implements rpv {
    private final ror a;

    public ron(ror rorVar) {
        this.a = rorVar;
    }

    @Override // defpackage.rpv
    public final void a(rpz rpzVar, rqa rqaVar) {
        boolean equals = "POST".equals(rpzVar.c);
        boolean z = !equals && "GET".equals(rpzVar.c);
        if (!z && !equals) {
            rqaVar.c = 501;
            rqaVar.d = "Not implemented";
            rqaVar.e = rpx.a(String.valueOf(rpzVar.c).concat(" not implemented"));
            return;
        }
        List<String> queryParameters = rpzVar.d.getQueryParameters("argv");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        rox roxVar = new rox(new ByteArrayInputStream(new byte[0]), byteArrayOutputStream);
        String str = true != equals ? "WARNING" : "ERROR";
        roxVar.d.println("*** " + str + ": Using legacy HTTP protocol; update dumpapp script! ***");
        if (z) {
            roq.b(this.a, roxVar, (String[]) queryParameters.toArray(new String[queryParameters.size()]));
        } else {
            roxVar.c(1);
        }
        rqaVar.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        rqaVar.d = "OK";
        rqaVar.a("Access-Control-Allow-Origin", "*");
        rqaVar.e = new rpw("application/octet-stream", byteArrayOutputStream.toByteArray());
    }
}
