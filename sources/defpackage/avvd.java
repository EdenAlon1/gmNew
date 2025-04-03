package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class avvd {
    public static final entd f = entd.c("BugleFileTransfer");

    public static avvc g() {
        avup avupVar = new avup();
        avupVar.f(cqpn.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
        avupVar.e(0);
        avupVar.d(enoz.a);
        avupVar.g("");
        return avupVar;
    }

    private final epxw l() {
        int i;
        epxw epxwVar = (epxw) epyb.a.createBuilder();
        cqpn b = b();
        switch (b) {
            case FILE_TRANSFER_FAILURE_REASON_UNKNOWN:
                i = 1;
                break;
            case FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED:
                i = 2;
                break;
            case FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY:
                i = 3;
                break;
            case FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED:
                i = 4;
                break;
            case FILE_TRANSFER_FAILURE_REASON_MESSAGE_NOT_FOUND:
                i = 5;
                break;
            case FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE:
                i = 6;
                break;
            case FILE_TRANSFER_FAILURE_REASON_MANUAL_CANCELLATION:
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b))));
            case FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_CANCELLATION:
                i = 7;
                break;
            case FILE_TRANSFER_FAILURE_REASON_MAX_REDIRECTS_REACHED:
                i = 8;
                break;
            case FILE_TRANSFER_FAILURE_REASON_CLOSING_THE_FILE_FAILED:
                i = 9;
                break;
            case FILE_TRANSFER_FAILURE_REASON_OPENING_THE_FILE_FAILED:
                i = 10;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_PARSE_XML:
                i = 11;
                break;
            case FILE_TRANSFER_FAILURE_REASON_TACHYON_TOKEN_FAILURE:
                i = 12;
                break;
            case FILE_TRANSFER_FAILURE_REASON_INVALID_RCS_CONFIGURATION:
                i = 13;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_HTTP_RESPONSE:
                i = 14;
                break;
            case FILE_TRANSFER_FAILURE_REASON_TRANSFER_EXCEPTION:
                i = 15;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_PREPARE_FILE:
                i = 16;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_ACTIVE_TRANSPORT:
                i = 17;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_FILE_SIZE:
                i = 18;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB:
                i = 19;
                break;
            case FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL:
                i = 20;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FILE_NOT_FOUND_WHILE_TRYING_TO_DECRYPT:
                i = 21;
                break;
            case FILE_TRANSFER_FAILURE_REASON_FAILED_TO_INSERT_OR_UPDATE_FILE_TRANSFER_ENTRY_IN_DB:
                i = 22;
                break;
        }
        epxwVar.copyOnWrite();
        epyb epybVar = (epyb) epxwVar.instance;
        epybVar.e = i - 1;
        epybVar.b |= 1;
        epyc epycVar = (epyc) epyd.a.createBuilder();
        long a = a();
        epycVar.copyOnWrite();
        epyd epydVar = (epyd) epycVar.instance;
        epydVar.b = 1 | epydVar.b;
        epydVar.c = a;
        epxwVar.copyOnWrite();
        epyb epybVar2 = (epyb) epxwVar.instance;
        epyd epydVar2 = (epyd) epycVar.build();
        epydVar2.getClass();
        epybVar2.f = epydVar2;
        epybVar2.b |= 2;
        return epxwVar;
    }

    public abstract int a();

    public abstract cqpn b();

    public abstract enhk c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract String f();

    public final epyb h() {
        final epxw l = l();
        d().ifPresent(new Consumer() { // from class: avvb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                entd entdVar = avvd.f;
                eqob a = cquj.a((CronetException) obj);
                epxw epxwVar = epxw.this;
                epxwVar.copyOnWrite();
                epyb epybVar = (epyb) epxwVar.instance;
                epyb epybVar2 = epyb.a;
                a.getClass();
                epybVar.g = a;
                epybVar.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (epyb) l.build();
    }

    public final epyb i(epyh epyhVar) {
        final epxw l = l();
        l.copyOnWrite();
        epyb epybVar = (epyb) l.instance;
        epyb epybVar2 = epyb.a;
        epyhVar.getClass();
        epybVar.h = epyhVar;
        epybVar.b |= 8;
        d().ifPresent(new Consumer() { // from class: avux
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                entd entdVar = avvd.f;
                eqob a = cquj.a((CronetException) obj);
                epxw epxwVar = epxw.this;
                epxwVar.copyOnWrite();
                epyb epybVar3 = (epyb) epxwVar.instance;
                epyb epybVar4 = epyb.a;
                a.getClass();
                epybVar3.g = a;
                epybVar3.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (epyb) l.build();
    }

    public final epyb j(int i, epyh epyhVar) {
        final epxw l = l();
        l.copyOnWrite();
        epyb epybVar = (epyb) l.instance;
        epyb epybVar2 = epyb.a;
        epyhVar.getClass();
        epybVar.h = epyhVar;
        epybVar.b |= 8;
        l.copyOnWrite();
        epyb epybVar3 = (epyb) l.instance;
        epybVar3.b |= 16;
        epybVar3.i = i;
        d().ifPresent(new Consumer() { // from class: avva
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                entd entdVar = avvd.f;
                eqob a = cquj.a((CronetException) obj);
                epxw epxwVar = epxw.this;
                epxwVar.copyOnWrite();
                epyb epybVar4 = (epyb) epxwVar.instance;
                epyb epybVar5 = epyb.a;
                a.getClass();
                epybVar4.g = a;
                epybVar4.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        int ordinal = b().ordinal();
        int i2 = 6;
        if (ordinal == 12) {
            fata a = esqa.a(((esps) e().get()).a);
            l.copyOnWrite();
            epyb epybVar4 = (epyb) l.instance;
            epybVar4.d = a;
            epybVar4.c = 6;
        } else if (ordinal == 15) {
            fawk fawkVar = ((fawl) e().get()).a;
            fawkVar.getClass();
            int ordinal2 = fawkVar.ordinal();
            int i3 = 2;
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    i2 = 3;
                } else if (ordinal2 != 2) {
                    i3 = 5;
                    if (ordinal2 != 3) {
                        if (ordinal2 != 4) {
                            if (ordinal2 != 5) {
                                throw new IllegalArgumentException("unknown enum value: ".concat(fawkVar.toString()));
                            }
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 4;
                }
                l.copyOnWrite();
                epyb epybVar5 = (epyb) l.instance;
                epybVar5.d = Integer.valueOf(i2 - 1);
                epybVar5.c = 7;
            }
            i2 = i3;
            l.copyOnWrite();
            epyb epybVar52 = (epyb) l.instance;
            epybVar52.d = Integer.valueOf(i2 - 1);
            epybVar52.c = 7;
        }
        return (epyb) l.build();
    }

    public final String k() {
        return d().isPresent() ? (String) d().map(new Function() { // from class: avuy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CronetException) obj).getMessage();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("") : (String) e().map(new Function() { // from class: avuz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Throwable) obj).getMessage();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("");
    }
}
