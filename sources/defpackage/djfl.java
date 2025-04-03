package defpackage;

import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.ByteArrayInputStream;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djfl {
    public static engw a(dkjt dkjtVar) {
        if (dkjtVar.a != dkjs.CPIM_MESSAGE) {
            ContentType e = ContentType.e(dkjtVar.h);
            eidy eidyVar = new eidy();
            eidyVar.b(eyee.x(dkjtVar.f));
            eidyVar.c(e);
            return engw.r(AutoOneOf_Message_MessageContent.a(eidyVar.a()));
        }
        edzi b = edzi.b(dkjtVar.f);
        if (!b.r()) {
            eidf eidfVar = (eidf) eidw.a(dkjtVar.f);
            ContentType e2 = ContentType.e((String) eidfVar.c.f().orElseThrow(new Supplier() { // from class: djfj
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new IllegalArgumentException("No Content-Type given!");
                }
            }));
            eidy eidyVar2 = new eidy();
            eidyVar2.b(((eidh) eidfVar.c).a);
            eidyVar2.c(e2);
            return engw.r(AutoOneOf_Message_MessageContent.a(eidyVar2.a()));
        }
        String h = b.h();
        if (h == null) {
            int i = engw.d;
            return enou.a;
        }
        engr engrVar = new engr();
        djfk djfkVar = new djfk(engrVar);
        byte[] bArr = b.c;
        if (bArr == null || bArr.length == 0) {
            int i2 = engw.d;
            return enou.a;
        }
        djay.b(new ByteArrayInputStream(bArr), h, djfkVar);
        return engrVar.g();
    }
}
