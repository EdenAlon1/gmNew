package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqz implements lrm {
    final /* synthetic */ nrb a;
    private final npc b;

    public nqz(nrb nrbVar, npc npcVar) {
        this.a = nrbVar;
        this.b = npcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    @Override // defpackage.lrm
    public final void B(lsb lsbVar) {
        try {
            ?? b = lsbVar.b(1);
            int i = b;
            if (lsbVar.b(2)) {
                i = b + 1;
            }
            for (int i2 = 0; i2 < lsbVar.b.size(); i2++) {
                int a = ((lsa) lsbVar.b.get(i2)).a();
                if (a != 1 && a != 2) {
                    luj.f("ExoPlayerAssetLoader", a.h(a, "Unsupported track type: "));
                }
            }
            if (i > 0) {
                this.b.c(i);
                this.a.c.e();
            } else {
                nrb nrbVar = this.a;
                this.b.b(new nrd("Asset loader error", new IllegalStateException(ntl.f(nrbVar.a, nrbVar.b.a) ? a.v("The asset loader has no audio or video track to output.", " Try setting an image duration on input image MediaItems.") : "The asset loader has no audio or video track to output."), 1001));
            }
        } catch (RuntimeException e) {
            this.b.b(new nrd("Asset loader error", e, 1000));
        }
    }

    @Override // defpackage.lrm
    public final void p(lrh lrhVar) {
        String str;
        Throwable cause = lrhVar.getCause();
        if ((cause instanceof mgy) && ((mgy) cause).a == 1) {
            luj.d("ExoPlayerAssetLoader", "Releasing the player timed out.", lrhVar);
            return;
        }
        int i = lrhVar.a;
        engf engfVar = nrd.a;
        if (i == 7000) {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        } else if (i != 7001) {
            switch (i) {
                case 1000:
                    str = "ERROR_CODE_UNSPECIFIED";
                    break;
                case 1001:
                    str = "ERROR_CODE_REMOTE_ERROR";
                    break;
                case 1002:
                    str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    break;
                case 1003:
                    str = "ERROR_CODE_TIMEOUT";
                    break;
                case 1004:
                    str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    break;
                default:
                    switch (i) {
                        case 2000:
                            str = "ERROR_CODE_IO_UNSPECIFIED";
                            break;
                        case 2001:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            break;
                        case 2002:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            break;
                        case 2003:
                            str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            break;
                        case 2004:
                            str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            break;
                        case 2005:
                            str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                            break;
                        case 2006:
                            str = "ERROR_CODE_IO_NO_PERMISSION";
                            break;
                        case 2007:
                            str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            break;
                        case 2008:
                            str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            break;
                        default:
                            switch (i) {
                                case 3001:
                                    str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    break;
                                case 3002:
                                    str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    break;
                                case 3003:
                                    str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    break;
                                case 3004:
                                    str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    break;
                                default:
                                    switch (i) {
                                        case 4001:
                                            str = "ERROR_CODE_DECODER_INIT_FAILED";
                                            break;
                                        case 4002:
                                            str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                            break;
                                        case 4003:
                                            str = "ERROR_CODE_DECODING_FAILED";
                                            break;
                                        case 4004:
                                            str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            break;
                                        case 4005:
                                            str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            break;
                                        case 4006:
                                            str = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                            break;
                                        default:
                                            switch (i) {
                                                case 5001:
                                                    str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                    break;
                                                case 5002:
                                                    str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                    break;
                                                case 5003:
                                                    str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                    break;
                                                case 5004:
                                                    str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 6000:
                                                            str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                            break;
                                                        case 6001:
                                                            str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                            break;
                                                        case 6002:
                                                            str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                            break;
                                                        case 6003:
                                                            str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                            break;
                                                        case 6004:
                                                            str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                            break;
                                                        case 6005:
                                                            str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                            break;
                                                        case 6006:
                                                            str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                            break;
                                                        case 6007:
                                                            str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                            break;
                                                        case 6008:
                                                            str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                            break;
                                                        default:
                                                            str = "invalid error code";
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        Integer num = (Integer) engfVar.getOrDefault(str, 1000);
        lti.f(num);
        this.b.b(new nrd("Asset loader error", lrhVar, num.intValue()));
    }

    @Override // defpackage.lrm
    public final void z(lru lruVar, int i) {
        try {
            if (this.a.d != 1) {
                return;
            }
            lrt lrtVar = new lrt();
            lruVar.p(0, lrtVar);
            if (lrtVar.k) {
                return;
            }
            long j = lrtVar.m;
            this.a.d = j > 0 ? 2 : 3;
            this.b.a(j);
        } catch (RuntimeException e) {
            this.b.b(new nrd("Asset loader error", e, 1000));
        }
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void A(lrz lrzVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void C(lsl lslVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void D(lrl lrlVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void a(lpk lpkVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void c(lrk lrkVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void d(lta ltaVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void h(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void j(lqz lqzVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void k(lrb lrbVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void m(lri lriVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void n(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void q(lrh lrhVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void s(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void i(lqw lqwVar, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void t(lrn lrnVar, lrn lrnVar2, int i) {
    }
}
