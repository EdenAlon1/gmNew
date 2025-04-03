package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzxt implements craz {
    private static final cskc a = cskc.g("BugleEtouffee", "EncryptedFileUploadPostprocessor");
    private final avty b = new avty();

    public final awvb a(awvb awvbVar, String str, String str2) {
        awva awvaVar = (awva) awvbVar.toBuilder();
        if (str != null) {
            if (str.length() == 0) {
                throw new bzxs();
            }
            a.m("File name in FileInformation replaced with name from database.");
            awvaVar.copyOnWrite();
            ((awvb) awvaVar.instance).c = str;
        }
        if (str2 != null) {
            try {
                ContentType e = ContentType.e(str2);
                a.m("Content type in FileInformation replaced with type from database.");
                awup awupVar = (awup) this.b.m().fP(e);
                awvaVar.copyOnWrite();
                awvb awvbVar2 = (awvb) awvaVar.instance;
                awupVar.getClass();
                awvbVar2.e = awupVar;
                awvbVar2.b |= 1;
            } catch (IllegalArgumentException e2) {
                throw new bzxs("Unable to parse file content type from EtouffeeRcsMetadataTable", e2);
            }
        }
        return (awvb) awvaVar.build();
    }

    @Override // defpackage.craz
    public final awvd b(MessageCoreData messageCoreData, final awvd awvdVar) {
        Object apply;
        if (!messageCoreData.cB()) {
            return awvdVar;
        }
        try {
            ekzz f = eleg.f("EncryptedFileUploadPostprocessor#updateResponse");
            try {
                bdhg D = messageCoreData.D();
                Function function = new Function() { // from class: bzxr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        awvd awvdVar2 = awvdVar;
                        bszs bszsVar = (bszs) obj;
                        awvc awvcVar = (awvc) awvdVar2.toBuilder();
                        awvb awvbVar = awvdVar2.c;
                        if (awvbVar == null) {
                            awvbVar = awvb.a;
                        }
                        bzxt bzxtVar = bzxt.this;
                        bszsVar.az(14, "plaintext_attachment_name");
                        String str = bszsVar.o;
                        bszsVar.az(15, "plaintext_attachment_content_type");
                        awvb a2 = bzxtVar.a(awvbVar, str, bszsVar.p);
                        awvcVar.copyOnWrite();
                        awvd awvdVar3 = (awvd) awvcVar.instance;
                        a2.getClass();
                        awvdVar3.c = a2;
                        awvdVar3.b |= 1;
                        if ((awvdVar2.b & 2) != 0) {
                            awvb awvbVar2 = awvdVar2.d;
                            if (awvbVar2 == null) {
                                awvbVar2 = awvb.a;
                            }
                            bszsVar.az(16, "plaintext_thumbnail_content_type");
                            awvb a3 = bzxtVar.a(awvbVar2, null, bszsVar.q);
                            awvcVar.copyOnWrite();
                            awvd awvdVar4 = (awvd) awvcVar.instance;
                            a3.getClass();
                            awvdVar4.d = a3;
                            awvdVar4.b |= 2;
                        }
                        return (awvd) awvcVar.build();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                btch a2 = btck.a();
                a2.z("etouffee_rcs_metadata.queryOnRcsMessageId");
                a2.q();
                btcj btcjVar = new btcj();
                btcjVar.b(D);
                a2.k(new btci(btcjVar));
                bszs bszsVar = (bszs) dtub.c(a2.b());
                if (bszsVar == null) {
                    throw new IllegalStateException("row not found");
                }
                apply = function.apply(bszsVar);
                awvd awvdVar2 = (awvd) apply;
                f.close();
                return awvdVar2;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new bzxs("Expected EtouffeeRcsMetadata table row is missing.", e);
        }
    }
}
