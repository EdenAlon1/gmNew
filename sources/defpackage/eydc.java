package defpackage;

import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eydc {
    public String a;
    public Map b;
    public Map c;

    public eydc() {
        b("", new EnumMap(eycx.class));
    }

    public final boolean a(eycx eycxVar) {
        Map map = this.b;
        Map map2 = this.c;
        return map2.containsKey(eycxVar) ? ((eydd) map2.get(eycxVar)).a != null : map.containsKey(eycxVar);
    }

    public final void b(String str, EnumMap enumMap) {
        this.a = str;
        this.b = enumMap;
        this.c = new EnumMap(eycx.class);
    }

    public final void c(eycx eycxVar) {
        Optional empty;
        Object valueOf;
        a(eycxVar);
        Map map = this.b;
        Map map2 = this.c;
        if (map2.containsKey(eycxVar)) {
            if (((eydd) map2.get(eycxVar)).a != null) {
                boolean z = ((eydd) map2.get(eycxVar)).b;
                return;
            }
            return;
        }
        if (map.containsKey(eycxVar) && ((eycy) map.get(eycxVar)).e) {
            if (this.c.containsKey(eycxVar)) {
                Map map3 = this.c;
                map3.put(eycxVar, new eydd(((eydd) map3.get(eycxVar)).a));
                return;
            }
            Map map4 = this.c;
            String str = this.a;
            Map map5 = this.b;
            if (map4.containsKey(eycxVar)) {
                Object obj = ((eydd) map4.get(eycxVar)).a;
                empty = obj == null ? Optional.empty() : Optional.of(obj);
            } else if (map5.containsKey(eycxVar)) {
                eycy eycyVar = (eycy) map5.get(eycxVar);
                try {
                    switch (eycxVar.bf) {
                        case FIXED_LENGTH_BASE_64:
                            if (eycz.b(eycyVar) == 0) {
                                throw new eydb("A FixedLengthBase64 option must have an non-empty value.");
                            }
                            valueOf = Long.valueOf(ermr.c(eoeg.f.g().k(eycz.c(str, eycyVar))));
                            empty = Optional.of(valueOf);
                            break;
                        case BOOLEAN:
                            if (eycz.b(eycyVar) > 0) {
                                throw new eydb("A Boolean option must have an empty value.");
                            }
                            valueOf = true;
                            empty = Optional.of(valueOf);
                            break;
                        case STRING:
                            if (eycz.b(eycyVar) == 0) {
                                throw new eydb("A Float option must have an non-empty value.");
                            }
                            valueOf = eycz.c(str, eycyVar);
                            empty = Optional.of(valueOf);
                            break;
                        case INTEGER:
                            if (eycz.b(eycyVar) == 0) {
                                throw new eydb("An Integer option must have an non-empty value.");
                            }
                            try {
                                valueOf = Integer.valueOf(Integer.parseInt(eycz.c(str, eycyVar)));
                                empty = Optional.of(valueOf);
                                break;
                            } catch (NumberFormatException e) {
                                throw new eydb(e);
                            }
                        case LONG:
                            if (eycz.b(eycyVar) == 0) {
                                throw new eydb("A Long option must have an non-empty value.");
                            }
                            try {
                                valueOf = Long.valueOf(Long.parseLong(eycz.c(str, eycyVar)));
                                empty = Optional.of(valueOf);
                                break;
                            } catch (NumberFormatException e2) {
                                throw new eydb(e2);
                            }
                        case FLOAT:
                            if (eycz.b(eycyVar) == 0) {
                                throw new eydb("A Float option must have an non-empty value.");
                            }
                            try {
                                valueOf = Float.valueOf(Float.parseFloat(eycz.c(str, eycyVar)));
                                empty = Optional.of(valueOf);
                                break;
                            } catch (NumberFormatException e3) {
                                throw new eydb(e3);
                            }
                        case PREFIX_HEX:
                            if (eycz.b(eycyVar) <= 2) {
                                throw new eydb("A PrefixHex option must have a value of at least 2 chars.");
                            }
                            String c = eycz.c(str, eycyVar);
                            if (!"0x".equals(c.substring(0, 2))) {
                                throw new eydb("A PrefixHex option must begin with '0x'.");
                            }
                            try {
                                String substring = c.substring(2);
                                substring.getClass();
                                long parseLong = Long.parseLong(substring, 16);
                                if ((4294967295L & parseLong) != parseLong) {
                                    throw new NumberFormatException("Input " + substring + " in base 16 is not in the range of an unsigned integer");
                                }
                                valueOf = Integer.valueOf((int) parseLong);
                                empty = Optional.of(valueOf);
                                break;
                            } catch (NumberFormatException e4) {
                                throw new eydb(e4);
                            }
                        case FIFE_SAFE_BASE_64:
                            valueOf = new String(eoeg.f.g().k(eycz.c(str, eycyVar).replace('~', '-')), StandardCharsets.ISO_8859_1);
                            empty = Optional.of(valueOf);
                            break;
                        default:
                            throw new IllegalStateException(a.F(eycxVar.bf, "OptionType ", " not handled."));
                    }
                } catch (eydb e5) {
                    throw new eyde(e5);
                }
            } else {
                empty = Optional.empty();
            }
            map4.put(eycxVar, new eydd(empty.get()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (((java.lang.Long) r9).longValue() >= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (((java.lang.Integer) r9).intValue() >= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r0.isInfinite() == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.eycx r8, java.lang.Object r9) {
        /*
            r7 = this;
            eycw r0 = r8.bf
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L69;
                case 1: goto L54;
                case 2: goto L4a;
                case 3: goto L3f;
                case 4: goto L31;
                case 5: goto L21;
                case 6: goto L69;
                case 7: goto L69;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            eycw r8 = r8.bf
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "Unexpected option type: "
            java.lang.String r8 = r0.concat(r8)
            r9.<init>(r8)
            throw r9
        L21:
            r0 = r9
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r3 = r0.isNaN()
            if (r3 != 0) goto L5b
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L5b
            goto L48
        L31:
            r0 = r9
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L5b
            goto L48
        L3f:
            r0 = r9
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L5b
        L48:
            r1 = r2
            goto L5b
        L4a:
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            goto L5b
        L54:
            r0 = r9
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
        L5b:
            if (r1 != 0) goto L69
            eydd r9 = new eydd
            r0 = 0
            r9.<init>(r0)
            java.util.Map r0 = r7.c
            r0.put(r8, r9)
            return
        L69:
            eydd r0 = new eydd
            r0.<init>(r9)
            java.util.Map r9 = r7.c
            r9.put(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eydc.d(eycx, java.lang.Object):void");
    }

    public eydc(eydf eydfVar) {
        this.a = eydfVar.a;
        this.b = new EnumMap(eydfVar.b);
        this.c = new EnumMap(eydfVar.c);
    }
}
