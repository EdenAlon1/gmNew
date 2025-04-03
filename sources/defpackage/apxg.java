package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apxg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apxi b;
    final /* synthetic */ Uri c;
    final /* synthetic */ apor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apxg(apxi apxiVar, Uri uri, apor aporVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = apxiVar;
        this.c = uri;
        this.d = aporVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apxg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            apxi apxiVar = this.b;
            Uri uri = this.c;
            ffhd a = ekxi.a(apxiVar.a.hT());
            apxf apxfVar = new apxf(null, apxiVar, uri);
            this.a = 1;
            obj = ffra.a(a, apxfVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Number) obj).longValue() <= 0) {
            String[] strArr = PartsTable.a;
            bwdi bwdiVar = new bwdi();
            bwdiVar.ap("DefaultRbmMessageRepository#clearRichCardAttachmentOnPermanentFailure");
            bwdiVar.A();
            final Uri uri2 = this.c;
            final apor aporVar = this.d;
            bwdiVar.D(new Function() { // from class: apxe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bwdm bwdmVar = (bwdm) obj2;
                    bwdmVar.v(uri2);
                    bwdmVar.j(String.valueOf(apxi.T(aporVar)));
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwdiVar.b().e();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apxg(this.b, this.c, this.d, ffguVar);
    }
}
