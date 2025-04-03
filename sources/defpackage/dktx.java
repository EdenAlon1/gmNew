package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dktx {
    UNKNOWN("unknown"),
    FILE("file"),
    GENERIC(""),
    IMSI("imsi"),
    IP_ADDRESS("ip_address", new Function() { // from class: dkto
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Optional of;
            dktx dktxVar = dktx.UNKNOWN;
            boolean z = obj instanceof InetSocketAddress;
            Object address = z ? ((InetSocketAddress) obj).getAddress() : obj;
            if (address instanceof Inet4Address) {
                of = Optional.of("ipv4");
            } else {
                of = Optional.of(true != (address instanceof Inet6Address) ? "unknown" : "ipv6");
            }
            return enhk.m("ip_version", of, "port", !z ? Optional.empty() : Optional.of(String.valueOf(((InetSocketAddress) obj).getPort())));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    LOCATION("loc_country"),
    MESSAGE_CONTENT("message_content"),
    MSRP_MESSAGE("msrp_message"),
    PHONE_NUMBER("phone_number", new Function() { // from class: dktp
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return enhk.l("last2", dktx.a(obj, 2));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    SIM_GID("sim_gid"),
    SIM_ID("sim_id", new Function() { // from class: dktq
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return enhk.l("last3", dktx.a(obj, 3));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    SIM_OPERATOR("sim_operator"),
    SIP_MESSAGE("sip_message"),
    URI(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, new Function() { // from class: dktr
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            dktx dktxVar = dktx.UNKNOWN;
            String valueOf = String.valueOf(obj);
            int indexOf = valueOf.indexOf(":");
            return enhk.m("scheme", (indexOf <= 0 || indexOf >= valueOf.length()) ? Optional.empty() : Optional.of(valueOf.substring(0, indexOf)), "last2", dktx.a(obj, 2));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    URI_SIP("uri_sip"),
    URI_TEL("uri_tel", new Function() { // from class: dkts
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return enhk.l("last2", dktx.a(obj, 2));
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }),
    USER_ID("user_id"),
    USER_ID_BOT("user_id_bot"),
    SIM_ICCID("sim_iccid"),
    SUBSCRIPTION_ID("subscription_id");

    private final String v;
    private final Function w;

    dktx(String str) {
        this(str, new Function() { // from class: dktw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktx dktxVar = dktx.UNKNOWN;
                return enoz.a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static Optional a(Object obj, int i) {
        String valueOf = String.valueOf(obj);
        return valueOf.length() <= i ? Optional.of(valueOf) : Optional.of(valueOf.substring(valueOf.length() - i));
    }

    public final String b(Collection collection) {
        return (String) Collection.EL.stream(collection).map(new Function() { // from class: dktt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dktx.this.c(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","));
    }

    public final String c(Object obj) {
        Object apply;
        String str = dkty.a;
        boolean booleanValue = ((Boolean) dinr.g.a()).booleanValue();
        String valueOf = String.valueOf(obj);
        if (!booleanValue && obj != null) {
            valueOf = "chars:" + valueOf.length();
            apply = this.w.apply(obj);
            String str2 = (String) Collection.EL.stream(((enhk) apply).entrySet()).filter(new Predicate() { // from class: dktu
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    dktx dktxVar = dktx.UNKNOWN;
                    return ((Optional) ((Map.Entry) obj2).getValue()).isPresent();
                }
            }).map(new Function() { // from class: dktv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Map.Entry entry = (Map.Entry) obj2;
                    dktx dktxVar = dktx.UNKNOWN;
                    return String.format("%s:%s", entry.getKey(), ((Optional) entry.getValue()).get());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(","));
            if (!str2.isEmpty()) {
                valueOf = a.w(str2, valueOf, ",");
            }
        }
        return String.format("%s-pii:%s[%s]", true != booleanValue ? "redacted" : "raw", this.v, valueOf);
    }

    dktx(String str, Function function) {
        this.v = str;
        this.w = function;
    }
}
