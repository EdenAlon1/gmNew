package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.util.Content;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdwt {
    public static final cskc a = cskc.g("Bugle", "LocationUtils");
    public static final String b = new String(Character.toChars(128205));
    private final Context c;
    private final bcxm d;

    public bdwt(Context context, bcxm bcxmVar) {
        this.c = context;
        this.d = bcxmVar;
    }

    public final PendingAttachmentData a(LocationInformation locationInformation) {
        byte[] bArr;
        Content content = locationInformation.g;
        Uri uri = null;
        if (content != null && (bArr = content.a) != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                Uri g = cbgi.g(byteArrayInputStream, this.c);
                try {
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    a.s("Could not save location preview, http url will be used instead.", e);
                }
                uri = g;
            } finally {
            }
        }
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        Uri uri2 = uri;
        StringBuilder sb = new StringBuilder();
        String lineSeparator = System.lineSeparator();
        cuxt.f(sb, !TextUtils.isEmpty(locationInformation.a) ? locationInformation.a : this.c.getString(R.string.shared_location), lineSeparator);
        List i = emye.d(System.lineSeparator()).i(locationInformation.a);
        int i2 = 0;
        while (true) {
            if (i2 >= i.size()) {
                cuxt.f(sb, String.format(Locale.US, "https://www.google.com/maps/place/%1$.5f,%2$.5f/", Double.valueOf(locationInformation.d), Double.valueOf(locationInformation.c)), lineSeparator);
                break;
            }
            if (cuxu.b((String) i.get(i2))) {
                break;
            }
            i2++;
        }
        String sb2 = sb.toString();
        bcxm bcxmVar = this.d;
        ffbr ffbrVar = bcxmVar.a;
        eohh eohhVar = eohh.LOCATION_CUSTOM;
        ctfj ctfjVar = (ctfj) ffbrVar.b();
        ctfjVar.getClass();
        Context context = (Context) bcxmVar.b.b();
        context.getClass();
        csuk csukVar = (csuk) bcxmVar.c.b();
        csukVar.getClass();
        cpbs cpbsVar = (cpbs) bcxmVar.d.b();
        cpbsVar.getClass();
        csuu csuuVar = (csuu) bcxmVar.e.b();
        csuuVar.getClass();
        bcwz bcwzVar = (bcwz) bcxmVar.f.b();
        bcwzVar.getClass();
        cbar cbarVar = (cbar) bcxmVar.g.b();
        cbarVar.getClass();
        cpaz cpazVar = (cpaz) bcxmVar.i.b();
        cpazVar.getClass();
        bcxm bcxmVar2 = (bcxm) bcxmVar.t.b();
        bcxmVar2.getClass();
        ctap ctapVar = (ctap) bcxmVar.j.b();
        ctapVar.getClass();
        cqoh cqohVar = (cqoh) bcxmVar.k.b();
        cqohVar.getClass();
        ctyz ctyzVar = (ctyz) bcxmVar.l.b();
        ctyzVar.getClass();
        cswf cswfVar = (cswf) bcxmVar.m.b();
        cswfVar.getClass();
        Optional optional = (Optional) bcxmVar.n.b();
        optional.getClass();
        ctfn ctfnVar = (ctfn) bcxmVar.o.b();
        ctfnVar.getClass();
        errl errlVar = (errl) bcxmVar.p.b();
        errlVar.getClass();
        asmj asmjVar = (asmj) bcxmVar.q.b();
        asmjVar.getClass();
        eohhVar.getClass();
        aswd aswdVar = (aswd) bcxmVar.s.b();
        aswdVar.getClass();
        return new PendingAttachmentData(ctfjVar, context, csukVar, cpbsVar, csuuVar, bcwzVar, cbarVar, bcxmVar.h, cpazVar, bcxmVar2, ctapVar, cqohVar, ctyzVar, cswfVar, optional, ctfnVar, errlVar, asmjVar, bcxmVar.r, sb2, uri2, eohhVar, locationInformation, aswdVar);
    }

    public final String b(MessagePartCoreData messagePartCoreData) {
        if (!messagePartCoreData.bp()) {
            throw new IllegalArgumentException("Cannot generate location sms text for non-location attachment.");
        }
        LocationInformation K = messagePartCoreData.K();
        K.getClass();
        return this.c.getString(R.string.share_location_prefix, b, String.format(Locale.US, "https://www.google.com/maps/place/%1$.5f,%2$.5f/", Double.valueOf(K.d), Double.valueOf(K.c)));
    }
}
