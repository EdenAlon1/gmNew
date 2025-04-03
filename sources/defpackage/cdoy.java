package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.io.FileNotFoundException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdoy implements cdoe {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadWorkerAdapterImpl");
    public static final cskc b = cskc.g("BugleCms", "CmsMediaUploadWorkerAdapter");
    public final eisx c;
    public final ccbt d;
    public final axkm e;
    public final errl f;
    public final axdf g;
    public final ccdo h;
    public final cqoh i;
    private final cdmr j;
    private final crty k;
    private final ffbr l;
    private final ffbr m;
    private final errl n;
    private final akzt o;
    private final errl p;

    public cdoy(eisx eisxVar, cdmr cdmrVar, crty crtyVar, ffbr ffbrVar, ffbr ffbrVar2, axkm axkmVar, ccbt ccbtVar, axdf axdfVar, ccdo ccdoVar, cqoh cqohVar, akzt akztVar, errl errlVar, errl errlVar2, errl errlVar3) {
        this.c = eisxVar;
        this.j = cdmrVar;
        this.k = crtyVar;
        this.l = ffbrVar;
        this.m = ffbrVar2;
        this.e = axkmVar;
        this.d = ccbtVar;
        this.o = akztVar;
        this.g = axdfVar;
        this.i = cqohVar;
        this.h = ccdoVar;
        this.n = errlVar;
        this.f = errlVar2;
        this.p = errlVar3;
    }

    public static epdt e(epeg epegVar, csgh csghVar, boolean z, int i) {
        epds epdsVar = (epds) epdt.a.createBuilder();
        epdw b2 = csgh.b(csghVar);
        epdsVar.copyOnWrite();
        epdt epdtVar = (epdt) epdsVar.instance;
        epdtVar.c = b2.w;
        epdtVar.b |= 1;
        epdsVar.copyOnWrite();
        epdt epdtVar2 = (epdt) epdsVar.instance;
        epdtVar2.g = (true != z ? 3 : 2) - 1;
        epdtVar2.b |= 16;
        epdsVar.copyOnWrite();
        epdt epdtVar3 = (epdt) epdsVar.instance;
        epdtVar3.d = 3;
        epdtVar3.b |= 2;
        epdsVar.copyOnWrite();
        epdt epdtVar4 = (epdt) epdsVar.instance;
        epdtVar4.b |= 8;
        epdtVar4.f = i;
        epdsVar.copyOnWrite();
        epdt epdtVar5 = (epdt) epdsVar.instance;
        epdtVar5.e = epegVar.bs;
        epdtVar5.b |= 4;
        return (epdt) epdsVar.build();
    }

    @Override // defpackage.cdoe
    public final elfl a(pot potVar) {
        csgh a2 = csgh.a(potVar.a("media_upload_type_key", csgh.UNDEFINED.e));
        final String d = potVar.d("target_id_key");
        final boolean h = potVar.h("is_initial_sync");
        final int a3 = potVar.a("attempt_count_key", -1);
        if (TextUtils.isEmpty(d)) {
            b.r("Undefined target Id for the upload task");
            f(4);
            this.g.f(e(epeg.WORK_ITEM_ID_MISSING, a2, h, a3));
            return elfo.e(new cdnc(new ppn(), null));
        }
        cdps cdpsVar = cdps.UNKNOWN_FAILURE;
        int ordinal = a2.ordinal();
        if (ordinal == 1) {
            final MessagePartCoreData a4 = ((bdpt) this.m.b()).a(d);
            if (a4 != null) {
                return this.j.b(a4).i(new eroh() { // from class: cdof
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final String str = (String) obj;
                        csjb a5 = cdoy.b.a();
                        a5.I("Upload media success");
                        final String str2 = d;
                        a5.A("part id", str2);
                        a5.A("CmsFileId", str);
                        a5.r();
                        final cdoy cdoyVar = cdoy.this;
                        cdoyVar.h(1);
                        boolean booleanValue = ((Boolean) ((cfup) csgj.Y.get()).e()).booleanValue();
                        boolean z = h;
                        final MessagePartCoreData messagePartCoreData = a4;
                        return (!booleanValue || z) ? cdoyVar.c(messagePartCoreData, str2, z, str) : cdoyVar.e.r().i(new eroh() { // from class: cdoj
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                cdoy cdoyVar2 = cdoy.this;
                                axkl axklVar = cdoyVar2.e.n;
                                boolean f = axkl.f((axeu) obj2);
                                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                                String str3 = str2;
                                String str4 = str;
                                if (f) {
                                    ensk h2 = cdoy.a.h();
                                    h2.Y(ente.a, "BugleCms");
                                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadWorkerAdapterImpl", "uploadMediaPart", 244, "CmsMediaUploadWorkerAdapterImpl.java")).q("Fi MD is enabled, enqueue incremental work immediately.");
                                    return cdoyVar2.c(messagePartCoreData2, str3, false, str4);
                                }
                                String[] strArr = bqon.a;
                                bqna bqnaVar = new bqna();
                                bqnaVar.i(5L);
                                bqnaVar.h(ccrk.a(5));
                                bqnaVar.e(messagePartCoreData2.B().b());
                                bqnaVar.f(cdoyVar2.i.f().toEpochMilli());
                                bqnaVar.c();
                                return cdoyVar2.d(messagePartCoreData2, str3, str4, false);
                            }
                        }, erpp.a);
                    }
                }, this.n).h(new emwl() { // from class: cdop
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return new cdnc(new ppp(), null);
                    }
                }, this.f).e(FileNotFoundException.class, new emwl() { // from class: cdoq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cdoy cdoyVar = cdoy.this;
                        cdoyVar.f(7);
                        cdoyVar.g.f(cdoy.e(epeg.MEDIA_UPLOAD_FILE_NOT_FOUND, csgh.MEDIA, h, a3));
                        return new cdnc(new ppn(), (FileNotFoundException) obj);
                    }
                }, this.f).f(cshh.class, new eroh() { // from class: cdor
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final cshh cshhVar = (cshh) obj;
                        cdoy.b.s("OutOfSqsStorageQuotaException thrown in uploadMediaPart! ", cshhVar);
                        cdoy cdoyVar = cdoy.this;
                        cdoyVar.g(cdps.OUT_OF_SQS_STORAGE_ERROR);
                        epeg epegVar = epeg.NO_SQS_STORAGE_QUOTA_FOR_MEDIA;
                        csgh csghVar = csgh.MEDIA;
                        boolean z = h;
                        int i = a3;
                        cdoyVar.g.f(cdoy.e(epegVar, csghVar, z, i));
                        cccd cccdVar = (cccd) ccce.a.createBuilder();
                        int a5 = cdoyVar.c.a();
                        cccdVar.copyOnWrite();
                        ccce ccceVar = (ccce) cccdVar.instance;
                        ccceVar.b |= 1;
                        ccceVar.c = a5;
                        cccdVar.copyOnWrite();
                        ccce ccceVar2 = (ccce) cccdVar.instance;
                        ccceVar2.b |= 2;
                        ccceVar2.d = 5;
                        String str = cshhVar.a;
                        cccdVar.copyOnWrite();
                        ccce ccceVar3 = (ccce) cccdVar.instance;
                        str.getClass();
                        ccceVar3.b |= 4;
                        ccceVar3.e = str;
                        cccdVar.copyOnWrite();
                        ccce ccceVar4 = (ccce) cccdVar.instance;
                        ccceVar4.b |= 16;
                        ccceVar4.g = z;
                        cccdVar.copyOnWrite();
                        ccce ccceVar5 = (ccce) cccdVar.instance;
                        ccceVar5.b |= 32;
                        ccceVar5.h = i;
                        return cdoyVar.d.b((ccce) cccdVar.build(), cshhVar, z, i).h(new emwl() { // from class: cdon
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return new cdnc(new ppn(), cshh.this);
                            }
                        }, cdoyVar.f);
                    }
                }, this.n).e(cdpr.class, new emwl() { // from class: cdos
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cdpr cdprVar = (cdpr) obj;
                        return new cdnc(cdoy.this.b(cdprVar, h, a3, csgh.MEDIA), cdprVar);
                    }
                }, this.f).e(Throwable.class, new emwl() { // from class: cdot
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        csjb e = cdoy.b.e();
                        e.I("Failed to upload media and update file. Will retry");
                        e.A("part id", d);
                        e.s(th);
                        epdw b2 = csgh.b(csgh.MEDIA);
                        boolean z = h;
                        int i = a3;
                        cdoy cdoyVar = cdoy.this;
                        cdoyVar.g.h(true, b2, z, i, th);
                        cdoyVar.g(cdps.UNKNOWN_FAILURE);
                        return new cdnc(new ppo(), th);
                    }
                }, this.f);
            }
            csjb e = b.e();
            e.I("Upload a non-exist part is requested");
            e.A("part id", d);
            e.r();
            f(4);
            this.g.f(e(epeg.LOCAL_ROW_MISSING, csgh.MEDIA, h, a3));
            return elfo.e(new cdnc(new ppn(), null));
        }
        if (ordinal == 2) {
            ParticipantsTable.BindData b2 = ((bdrr) this.l.b()).b(d);
            if (b2 != null) {
                return this.j.c(b2).h(new emwl() { // from class: cdok
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        csjb a5 = cdoy.b.a();
                        a5.I("Upload profile photo success");
                        String str = d;
                        a5.A("participant id", str);
                        a5.A("CmsFileId", (String) obj);
                        a5.r();
                        cdoy cdoyVar = cdoy.this;
                        cdoyVar.h(0);
                        cccd cccdVar = (cccd) ccce.a.createBuilder();
                        cccdVar.copyOnWrite();
                        ccce ccceVar = (ccce) cccdVar.instance;
                        ccceVar.b |= 16;
                        ccceVar.g = false;
                        int a6 = cdoyVar.c.a();
                        cccdVar.copyOnWrite();
                        ccce ccceVar2 = (ccce) cccdVar.instance;
                        ccceVar2.b |= 1;
                        ccceVar2.c = a6;
                        cccdVar.copyOnWrite();
                        ccce ccceVar3 = (ccce) cccdVar.instance;
                        str.getClass();
                        ccceVar3.b |= 4;
                        ccceVar3.e = str;
                        cccdVar.copyOnWrite();
                        ccce ccceVar4 = (ccce) cccdVar.instance;
                        ccceVar4.b |= 2;
                        ccceVar4.d = 3;
                        cccdVar.copyOnWrite();
                        ccce ccceVar5 = (ccce) cccdVar.instance;
                        ccceVar5.b |= 8;
                        ccceVar5.f = ccrk.a(5);
                        cdoyVar.h.c((ccce) cccdVar.build());
                        return new cdnc(new ppp(), null);
                    }
                }, this.p).e(cdpr.class, new emwl() { // from class: cdol
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        cdpr cdprVar = (cdpr) obj;
                        return new cdnc(cdoy.this.b(cdprVar, h, a3, csgh.PROFILE_PHOTO), cdprVar);
                    }
                }, this.f).e(Throwable.class, new emwl() { // from class: cdom
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        csjb e2 = cdoy.b.e();
                        e2.I("Failed to upload participant profile photo will retry");
                        e2.A("participant id", d);
                        e2.r();
                        epdw b3 = csgh.b(csgh.PROFILE_PHOTO);
                        boolean z = h;
                        int i = a3;
                        cdoy cdoyVar = cdoy.this;
                        cdoyVar.g.h(true, b3, z, i, th);
                        cdoyVar.g(cdps.UNKNOWN_FAILURE);
                        return new cdnc(new ppo(), th);
                    }
                }, this.f);
            }
            csjb e2 = b.e();
            e2.I("Upload a non-exist participant's profile photo is requested");
            e2.A("participant id", d);
            e2.r();
            f(4);
            this.g.f(e(epeg.LOCAL_ROW_MISSING, csgh.PROFILE_PHOTO, h, a3));
            return elfo.e(new cdnc(new ppn(), null));
        }
        if (ordinal != 3) {
            b.r("Undefined Upload task type");
            f(5);
            this.g.f(e(epeg.UNSUPPORTED_OPERATION, a2, h, a3));
            return elfo.e(new cdnc(new ppn(), null));
        }
        final MessagePartCoreData a5 = ((bdpt) this.m.b()).a(d);
        if (a5 != null) {
            return this.j.a(a5).i(new eroh() { // from class: cdou
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    String str = (String) obj;
                    csjb a6 = cdoy.b.a();
                    a6.I("Upload compressed image success");
                    String str2 = d;
                    a6.A("part id", str2);
                    a6.A("CmsFileId", str);
                    a6.r();
                    cdoy cdoyVar = cdoy.this;
                    cdoyVar.h(2);
                    MessagePartCoreData messagePartCoreData = a5;
                    cdoyVar.i(messagePartCoreData.B().b());
                    return cdoyVar.d(messagePartCoreData, str2, str, h);
                }
            }, this.n).h(new emwl() { // from class: cdov
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return new cdnc(new ppp(), null);
                }
            }, this.f).f(cshh.class, new eroh() { // from class: cdow
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final cshh cshhVar = (cshh) obj;
                    csjb e3 = cdoy.b.e();
                    e3.I("OutOfSqsStorageQuotaException thrown in uploadCompressedImage! ");
                    e3.s(cshhVar);
                    epeg epegVar = epeg.NO_SQS_STORAGE_QUOTA_FOR_COMPRESSED_IMAGE;
                    csgh csghVar = csgh.COMPRESSED_IMAGE;
                    boolean z = h;
                    epdt e4 = cdoy.e(epegVar, csghVar, z, a3);
                    cdoy cdoyVar = cdoy.this;
                    cdoyVar.g.f(e4);
                    cdoyVar.g(cdps.OUT_OF_SQS_STORAGE_ERROR);
                    cccd cccdVar = (cccd) ccce.a.createBuilder();
                    int a6 = cdoyVar.c.a();
                    cccdVar.copyOnWrite();
                    ccce ccceVar = (ccce) cccdVar.instance;
                    ccceVar.b |= 1;
                    ccceVar.c = a6;
                    cccdVar.copyOnWrite();
                    ccce ccceVar2 = (ccce) cccdVar.instance;
                    ccceVar2.b |= 2;
                    ccceVar2.d = 5;
                    String str = cshhVar.a;
                    cccdVar.copyOnWrite();
                    ccce ccceVar3 = (ccce) cccdVar.instance;
                    str.getClass();
                    ccceVar3.b |= 4;
                    ccceVar3.e = str;
                    cccdVar.copyOnWrite();
                    ccce ccceVar4 = (ccce) cccdVar.instance;
                    ccceVar4.b |= 16;
                    ccceVar4.g = z;
                    return cdoyVar.d.b((ccce) cccdVar.build(), cshhVar, z, 0).h(new emwl() { // from class: cdoo
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return new cdnc(new ppn(), cshh.this);
                        }
                    }, cdoyVar.f);
                }
            }, this.n).e(cdpr.class, new emwl() { // from class: cdox
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cdpr cdprVar = (cdpr) obj;
                    return new cdnc(cdoy.this.b(cdprVar, h, a3, csgh.COMPRESSED_IMAGE), cdprVar);
                }
            }, this.f).e(Throwable.class, new emwl() { // from class: cdog
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    csjb e3 = cdoy.b.e();
                    e3.I("Failed to upload compressed image will retry");
                    e3.A("part id", d);
                    e3.r();
                    epdw b3 = csgh.b(csgh.COMPRESSED_IMAGE);
                    boolean z = h;
                    int i = a3;
                    cdoy cdoyVar = cdoy.this;
                    cdoyVar.g.h(true, b3, z, i, th);
                    cdoyVar.g(cdps.UNKNOWN_FAILURE);
                    return new cdnc(new ppo(), th);
                }
            }, this.f);
        }
        csjb e3 = b.e();
        e3.I("Upload a non-exist image part is requested");
        e3.A("part id", d);
        e3.r();
        f(4);
        this.g.f(e(epeg.LOCAL_ROW_MISSING, csgh.COMPRESSED_IMAGE, h, a3));
        return elfo.e(new cdnc(new ppn(), null));
    }

    public final ppq b(cdpr cdprVar, boolean z, int i, csgh csghVar) {
        epeg epegVar;
        Integer num;
        b.r("Trying to get the result of file id before its computation completes or the upload operation failed. Will retry.".concat(String.valueOf(cdprVar.a.i)));
        cdps cdpsVar = cdprVar.a;
        if (cdpsVar != cdps.HTTP_RESPONSE_ERROR || (num = cdprVar.b) == null) {
            axdf axdfVar = this.g;
            switch (cdpsVar) {
                case UNKNOWN_FAILURE:
                    epegVar = epeg.MEDIA_UPLOAD_UNKNOWN_ERROR;
                    break;
                case HTTP_RESPONSE_ERROR:
                case OUT_OF_SQS_STORAGE_ERROR:
                    epegVar = epeg.UNSPECIFIED_REASON;
                    break;
                case HTTP_EMPTY_RESPONSE:
                    epegVar = epeg.MEDIA_UPLOAD_EMPTY_RESPONSE;
                    break;
                case ENCRYPTION_ERROR:
                    epegVar = epeg.MEDIA_UPLOAD_ENCRYPTION_ERROR;
                    break;
                case COMPRESS_IMAGE_ERROR:
                    epegVar = epeg.MEDIA_UPLOAD_IMAGE_COMPRESS_ERROR;
                    break;
                case FILE_NOT_FOUND_ORIGINAL:
                    epegVar = epeg.MEDIA_UPLOAD_FILE_NOT_FOUND_ORIGINAL;
                    break;
                case FILE_NOT_FOUND_WRITE_SCRATCH_SPACE:
                    epegVar = epeg.MEDIA_UPLOAD_FILE_NOT_FOUND_WRITE_SCRATCH_SPACE;
                    break;
                default:
                    throw new AssertionError("Should not reach here.");
            }
            axdfVar.f(e(epegVar, csghVar, z, i));
        } else {
            axdf axdfVar2 = this.g;
            int intValue = num.intValue();
            axdfVar2.f(e(intValue != 400 ? intValue != 401 ? intValue != 403 ? intValue != 404 ? intValue != 408 ? intValue != 412 ? intValue != 500 ? intValue != 503 ? epeg.SERVER_STATUS_OTHER : epeg.SERVER_STATUS_UNAVAILABLE : epeg.SERVER_STATUS_INTERNAL : epeg.SERVER_STATUS_FAILED_PRECONDITION : epeg.SERVER_STATUS_DEADLINE_EXCEEDED : epeg.SERVER_STATUS_NOT_FOUND : epeg.SERVER_STATUS_PERMISSION_DENIED : epeg.SERVER_STATUS_UNAUTHENTICATED : epeg.SERVER_STATUS_INVALID_ARGUMENT, csghVar, z, i));
        }
        g(cdprVar.a);
        return new ppo();
    }

    public final elfl c(MessagePartCoreData messagePartCoreData, String str, boolean z, String str2) {
        i(messagePartCoreData.B().b());
        return d(messagePartCoreData, str, str2, z);
    }

    public final elfl d(MessagePartCoreData messagePartCoreData, String str, String str2, boolean z) {
        if (!((Boolean) ((cfup) csgj.s.get()).e()).booleanValue() || !csgj.a()) {
            return elfo.e(null);
        }
        final long a2 = MessageIdType.a(messagePartCoreData.B());
        buxo d = MessagesTable.d();
        d.z("updateObjectIdForCmsFile");
        d.h(new Function() { // from class: cdoh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.q(bdhb.b(String.valueOf(a2)));
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) d.b().o()).cS();
        String R = bindData == null ? null : bindData.R();
        if (emxe.c(R)) {
            return elfo.e(null);
        }
        csjb c = b.c();
        c.I("Updating object ID for CMS file");
        c.A("part Id", str);
        c.A("CmsObjectId", R);
        c.A("CmsFileId", str2);
        c.r();
        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
        eyfgVar.a("object_id");
        eyfh eyfhVar = (eyfh) eyfgVar.build();
        crty crtyVar = this.k;
        esxj esxjVar = (esxj) esxk.a.createBuilder();
        esxjVar.copyOnWrite();
        esxk esxkVar = (esxk) esxjVar.instance;
        str2.getClass();
        esxkVar.b = str2;
        esxjVar.copyOnWrite();
        esxk esxkVar2 = (esxk) esxjVar.instance;
        R.getClass();
        esxkVar2.i = R;
        return crtyVar.U((esxk) esxjVar.build(), eyfhVar, z).h(new emwl() { // from class: cdoi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, this.f);
    }

    public final void f(int i) {
        this.o.e("Bugle.Cms.Media.Upload.Failure.Count", i);
    }

    public final void g(cdps cdpsVar) {
        int i;
        cdps cdpsVar2 = cdps.UNKNOWN_FAILURE;
        switch (cdpsVar.ordinal()) {
            case 1:
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            default:
                i = 0;
                break;
        }
        this.o.e("Bugle.Cms.Media.Upload.Failure.Count", i);
    }

    public final void h(int i) {
        this.o.e("Bugle.Cms.Media.Upload.Success.Count", i);
    }

    public final void i(String str) {
        cccd cccdVar = (cccd) ccce.a.createBuilder();
        cccdVar.copyOnWrite();
        ccce ccceVar = (ccce) cccdVar.instance;
        ccceVar.b |= 16;
        ccceVar.g = false;
        int a2 = this.c.a();
        cccdVar.copyOnWrite();
        ccce ccceVar2 = (ccce) cccdVar.instance;
        ccceVar2.b |= 1;
        ccceVar2.c = a2;
        cccdVar.copyOnWrite();
        ccce ccceVar3 = (ccce) cccdVar.instance;
        str.getClass();
        ccceVar3.b |= 4;
        ccceVar3.e = str;
        cccdVar.copyOnWrite();
        ccce ccceVar4 = (ccce) cccdVar.instance;
        ccceVar4.b |= 2;
        ccceVar4.d = 5;
        cccdVar.copyOnWrite();
        ccce ccceVar5 = (ccce) cccdVar.instance;
        ccceVar5.b |= 8;
        ccceVar5.f = ccrk.a(5);
        this.h.c((ccce) cccdVar.build());
    }
}
