package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzyx extends cowm {
    public static final cskc a = cskc.g("BugleEtouffee", "EncryptedRcsMessageConverter");
    public final ffbr b;
    public final ffbr c;
    public final caen d;
    public final errl e;
    public final errl f;
    public final akzt g;
    public final caet h;
    public final bzzi i;
    public final awtm j;
    public final ffbr k;
    private final caga n;
    private final errl o;
    private final avtw p;
    private final aolr q;

    public bzyx(ffbr ffbrVar, ffbr ffbrVar2, caga cagaVar, caen caenVar, errl errlVar, errl errlVar2, errl errlVar3, akzt akztVar, eikl eiklVar, avtw avtwVar, avtx avtxVar, aolr aolrVar, caet caetVar, bzzi bzziVar, awtm awtmVar, ffbr ffbrVar3) {
        super(eiklVar, avtxVar, errlVar3);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.n = cagaVar;
        this.d = caenVar;
        this.e = errlVar;
        this.o = errlVar2;
        this.f = errlVar3;
        this.g = akztVar;
        this.p = avtwVar;
        this.q = aolrVar;
        this.h = caetVar;
        this.i = bzziVar;
        this.j = awtmVar;
        this.k = ffbrVar3;
        ContentType contentType = eijw.a;
    }

    final elfl a(final bdhg bdhgVar, final awui awuiVar, final engw engwVar, final byte[] bArr, final String str, final eote eoteVar, final fayv fayvVar, final boolean z) {
        if (!bzwf.g()) {
            emxf.m(!z, "Only 1:1 conversations can be encrypted");
        }
        return this.n.a(awuiVar.d).i(new eroh() { // from class: bzyw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str2 = (String) obj;
                boolean isEmpty = TextUtils.isEmpty(str2);
                bzyx bzyxVar = bzyx.this;
                bdhg bdhgVar2 = bdhgVar;
                if (isEmpty) {
                    bzyxVar.g.e("Bugle.Etouffee.Encryption.Failure.Reason", 1);
                    bzyxVar.i.e(bdhgVar2, 3);
                }
                fayv fayvVar2 = fayvVar;
                boolean z2 = z;
                eote eoteVar2 = eoteVar;
                String str3 = str;
                engw engwVar2 = engwVar;
                awui awuiVar2 = awuiVar;
                byte[] bArr2 = bArr;
                emxf.m(true ^ TextUtils.isEmpty(str2), "Failed to retrieve local registration ID");
                return bzyxVar.b(bArr2, str2, awuiVar2, bdhgVar2, engwVar2, str3, false, eoteVar2, z2, fayvVar2);
            }
        }, this.f);
    }

    public final elfl b(final byte[] bArr, final String str, final awui awuiVar, final bdhg bdhgVar, final engw engwVar, final String str2, final boolean z, final eote eoteVar, final boolean z2, fayv fayvVar) {
        final fayv fayvVar2;
        ekzz f = eleg.f("EtouffeeMessageConverter#convert");
        if (fayvVar == null) {
            try {
                fayvVar2 = fayv.a;
            } finally {
            }
        } else {
            fayvVar2 = fayvVar;
        }
        elfl f2 = c(engwVar, z2).i(new eroh() { // from class: bzyr
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
            
                if (r14.E() != false) goto L17;
             */
            @Override // defpackage.eroh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 351
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bzyr.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.o).f(Throwable.class, new eroh() { // from class: bzys
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                csjb e = bzyx.a.e();
                e.I("Failed to send an encrypted message.");
                e.N("participants messaging identity destinations", Collection.EL.stream(engw.this).map(new Function() { // from class: bzyl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aoku) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                e.A("rcsMessageId", bdhgVar);
                e.r();
                return elfo.d((Throwable) obj);
            }
        }, erpp.a);
        f.b(f2);
        f.close();
        return f2;
    }

    final elfl c(final engw engwVar, final boolean z) {
        return elfo.g(new Callable() { // from class: bzyk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bzyx.this.d.c(engwVar, z);
            }
        }, this.e);
    }

    @Override // defpackage.cowm
    public final elfl d(MessageCoreData messageCoreData, avkl avklVar) {
        return e(cowi.a(messageCoreData), avklVar);
    }

    @Override // defpackage.cowm
    public final elfl e(cowj cowjVar, avkl avklVar) {
        if (!cowjVar.c) {
            return super.e(cowjVar, avklVar);
        }
        engw z = this.q.z(avklVar);
        boolean d = avklVar.d();
        ekzz f = eleg.f("EtouffeeMessageConverter#toChat");
        try {
            try {
                elfl a2 = a(cowjVar.a, cowjVar.d, z, cowjVar.b.getBytes(), "text/plain", eote.TEXT, cowjVar.e, d);
                f.b(a2);
                f.close();
                return a2.h(new emwl() { // from class: bzyt
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return avtw.a((ChatMessage) obj);
                    }
                }, this.f).e(IllegalStateException.class, new emwl() { // from class: bzyu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        throw new cowg((IllegalStateException) obj);
                    }
                }, this.f);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    f.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
