package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpn {
    public static final doxr a(droo drooVar) {
        dpgl dpglVar;
        int i;
        int i2;
        int i3 = drooVar.c;
        int i4 = 0;
        int i5 = 3;
        if (i3 == 200) {
            int i6 = ((drog) drooVar.d).b;
            if (i6 == 0) {
                i4 = 3;
            } else if (i6 == 100) {
                i4 = 1;
            } else if (i6 == 101) {
                i4 = 2;
            }
            if (i4 == 0) {
                throw null;
            }
            int i7 = i4 - 1;
            if (i7 == 0) {
                return dpgg.a;
            }
            if (i7 == 1) {
                return dpgi.a;
            }
            if (i7 != 2) {
                throw new ffcd();
            }
            Class<?> cls = drooVar.getClass();
            int i8 = fflc.a;
            throw new IllegalStateException("GallerySource proto has no source set during deserialization in local media: ".concat(String.valueOf(new ffkb(cls).c())));
        }
        if (i3 == 201) {
            drol drolVar = (drol) drooVar.d;
            drolVar.getClass();
            int i9 = drolVar.c;
            droj drojVar = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? null : droj.POPUP_CAMERA : droj.FULLSCREEN : droj.MINI_CAMERA : droj.CAMERA_LAYOUT_UNKNOWN;
            if (drojVar == null) {
                drojVar = droj.UNRECOGNIZED;
            }
            drojVar.getClass();
            int ordinal = drojVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    dpglVar = dpgl.a;
                } else if (ordinal == 2) {
                    dpglVar = dpgl.b;
                } else if (ordinal == 3) {
                    dpglVar = dpgl.c;
                } else if (ordinal != 4) {
                    throw new ffcd();
                }
                dpgl dpglVar2 = dpglVar;
                int i10 = drolVar.d;
                droi droiVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? null : droi.FRONT : droi.BACK : droi.CAMERA_FACING_UNKNOWN;
                if (droiVar == null) {
                    droiVar = droi.UNRECOGNIZED;
                }
                droiVar.getClass();
                int ordinal2 = droiVar.ordinal();
                if (ordinal2 == 0) {
                    i = 1;
                } else if (ordinal2 == 1) {
                    i = 2;
                } else {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new ffcd();
                        }
                        Class<?> cls2 = droiVar.getClass();
                        int i11 = fflc.a;
                        ffkb ffkbVar = new ffkb(cls2);
                        ffkbVar.toString();
                        throw new IllegalStateException("Unknown in app camera source facing value during deserialization in local media: ".concat(ffkbVar.toString()));
                    }
                    i = 3;
                }
                int i12 = drolVar.e;
                drok drokVar = i12 != 0 ? i12 != 1 ? i12 != 2 ? null : drok.LANDSCAPE : drok.PORTRAIT : drok.ORIENTATION_UNKNOWN;
                if (drokVar == null) {
                    drokVar = drok.UNRECOGNIZED;
                }
                drokVar.getClass();
                int ordinal3 = drokVar.ordinal();
                if (ordinal3 == 0) {
                    i2 = 1;
                } else if (ordinal3 == 1) {
                    i2 = 2;
                } else {
                    if (ordinal3 != 2) {
                        if (ordinal3 != 3) {
                            throw new ffcd();
                        }
                        Class<?> cls3 = drokVar.getClass();
                        int i13 = fflc.a;
                        ffkb ffkbVar2 = new ffkb(cls3);
                        ffkbVar2.toString();
                        throw new IllegalStateException("Unknown in app camera source orientation during deserialization in local media: ".concat(ffkbVar2.toString()));
                    }
                    i2 = 3;
                }
                return new dpgo(dpglVar2, i, i2, drolVar.f, null, (drolVar.b & 16) == 0 ? null : drolVar.g);
            }
            Class<?> cls4 = drojVar.getClass();
            int i14 = fflc.a;
            ffkb ffkbVar3 = new ffkb(cls4);
            ffkbVar3.toString();
            throw new IllegalStateException("Unknown in app camera source camera layout during deserialization in local media: ".concat(ffkbVar3.toString()));
        }
        if (i3 == 202) {
            return dpgq.a;
        }
        if (i3 == 203) {
            droa droaVar = drooVar.c == 203 ? (droa) drooVar.d : droa.a;
            droaVar.getClass();
            return new dqzn(droaVar);
        }
        doyi doyiVar = drooVar.f;
        if (doyiVar == null) {
            doyiVar = doyi.a;
        }
        doyiVar.getClass();
        if (doyo.c(doyiVar)) {
            doyi doyiVar2 = drooVar.f;
            if (doyiVar2 == null) {
                doyiVar2 = doyi.a;
            }
            doyiVar2.getClass();
            return doyo.a(doyiVar2);
        }
        doyy doyyVar = drooVar.e;
        if (doyyVar == null) {
            doyyVar = doyy.a;
        }
        doyyVar.getClass();
        int i15 = doyyVar.b;
        if (doyv.b(i15) == 0 || doyv.b(i15) == 1) {
            throw new IllegalArgumentException("Attachment source wasn't set");
        }
        if (i15 != 201) {
            if (i15 != 202) {
                if (i15 == 200) {
                    return doxq.a;
                }
                int b = doyv.b(i15);
                Objects.toString(doyv.a(b));
                throw new IllegalStateException("Unrecognized source serialized as ".concat(doyv.a(b)));
            }
            int i16 = ((doyu) doyyVar.c).c;
            if (i16 == 0) {
                i4 = 2;
            } else if (i16 == 1) {
                i4 = 3;
            }
            if (i4 == 0) {
                i4 = 1;
            }
            if (i4 - 2 == 1) {
                return new doxo();
            }
            throw new IllegalStateException("Unrecognized remote source category during attachment deserialization");
        }
        doys doysVar = (doys) doyyVar.c;
        doys doysVar2 = 1 != (doysVar.b & 1) ? null : doysVar;
        String str = doysVar2 != null ? doysVar2.c : null;
        int i17 = doysVar.d;
        if (i17 == 0) {
            i4 = 2;
        } else if (i17 == 1) {
            i4 = 3;
        } else if (i17 == 2) {
            i4 = 4;
        } else if (i17 == 3) {
            i4 = 5;
        } else if (i17 == 4) {
            i4 = 6;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        int i18 = i4 - 2;
        if (i18 == 0) {
            i5 = 1;
        } else if (i18 == 1) {
            i5 = 2;
        } else if (i18 != 2) {
            if (i18 == 3) {
                i5 = 4;
            } else {
                if (i18 != 4) {
                    throw new IllegalStateException("Unrecognized external source entrypoint during attachment deserialization");
                }
                i5 = 5;
            }
        }
        return new doxm(str, i5);
    }

    public static final droo b(drnn drnnVar) {
        droj drojVar;
        int i;
        drnu drnuVar = (drnu) droo.a.createBuilder();
        drnuVar.getClass();
        doyq doyqVar = (doyq) doyy.a.createBuilder();
        doyqVar.getClass();
        doxr fm = drnnVar.fm();
        if (fm instanceof doxm) {
            doyr doyrVar = (doyr) doys.a.createBuilder();
            doyrVar.getClass();
            doxm doxmVar = (doxm) fm;
            String str = doxmVar.a;
            if (str != null) {
                doyrVar.copyOnWrite();
                doys doysVar = (doys) doyrVar.instance;
                doysVar.b |= 1;
                doysVar.c = str;
            }
            int i2 = doxmVar.b - 1;
            if (i2 != 0) {
                i = 3;
                if (i2 != 1) {
                    i = i2 != 2 ? i2 != 3 ? 6 : 5 : 4;
                }
            } else {
                i = 2;
            }
            doyrVar.copyOnWrite();
            doys doysVar2 = (doys) doyrVar.instance;
            doysVar2.d = i - 2;
            doysVar2.b |= 2;
            eyfy build = doyrVar.build();
            build.getClass();
            doyqVar.copyOnWrite();
            doyy doyyVar = (doyy) doyqVar.instance;
            doyyVar.c = (doys) build;
            doyyVar.b = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
        } else if (fm instanceof doxo) {
            doyt doytVar = (doyt) doyu.a.createBuilder();
            doytVar.getClass();
            int i3 = ((doxo) fm).a;
            doytVar.copyOnWrite();
            doyu doyuVar = (doyu) doytVar.instance;
            doyuVar.c = 1;
            doyuVar.b |= 1;
            eyfy build2 = doytVar.build();
            build2.getClass();
            doyqVar.copyOnWrite();
            doyy doyyVar2 = (doyy) doyqVar.instance;
            doyyVar2.c = (doyu) build2;
            doyyVar2.b = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        } else if (fm instanceof doxq) {
            doyw doywVar = (doyw) doyx.a.createBuilder();
            doywVar.getClass();
            eyfy build3 = doywVar.build();
            build3.getClass();
            doyqVar.copyOnWrite();
            doyy doyyVar3 = (doyy) doyqVar.instance;
            doyyVar3.c = (doyx) build3;
            doyyVar3.b = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        eyfy build4 = doyqVar.build();
        build4.getClass();
        drnuVar.copyOnWrite();
        droo drooVar = (droo) drnuVar.instance;
        drooVar.e = (doyy) build4;
        drooVar.b |= 1;
        dros.b(doyo.b(drnnVar), drnuVar);
        drqs e = drqt.e(ffdx.b(drqw.a(drnnVar)));
        drnuVar.copyOnWrite();
        droo drooVar2 = (droo) drnuVar.instance;
        drooVar2.g = e;
        drooVar2.b |= 4;
        doxr fm2 = drnnVar.fm();
        if (fm2 instanceof drnj) {
            drnj drnjVar = (drnj) fm2;
            if (drnjVar instanceof dpgj) {
                drob drobVar = (drob) drog.a.createBuilder();
                drobVar.getClass();
                dpgj dpgjVar = (dpgj) drnjVar;
                if (ffkj.e(dpgjVar, dpgg.a)) {
                    droc drocVar = (droc) drod.a.createBuilder();
                    drocVar.getClass();
                    eyfy build5 = drocVar.build();
                    build5.getClass();
                    drobVar.copyOnWrite();
                    drog drogVar = (drog) drobVar.instance;
                    drogVar.c = (drod) build5;
                    drogVar.b = 100;
                } else {
                    if (!ffkj.e(dpgjVar, dpgi.a)) {
                        throw new ffcd();
                    }
                    droe droeVar = (droe) drof.a.createBuilder();
                    droeVar.getClass();
                    eyfy build6 = droeVar.build();
                    build6.getClass();
                    drobVar.copyOnWrite();
                    drog drogVar2 = (drog) drobVar.instance;
                    drogVar2.c = (drof) build6;
                    drogVar2.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                }
                eyfy build7 = drobVar.build();
                build7.getClass();
                drnuVar.copyOnWrite();
                droo drooVar3 = (droo) drnuVar.instance;
                drooVar3.d = (drog) build7;
                drooVar3.c = BasePaymentResult.ERROR_REQUEST_FAILED;
            } else if (drnjVar instanceof dpgo) {
                droh drohVar = (droh) drol.a.createBuilder();
                drohVar.getClass();
                dpgo dpgoVar = (dpgo) drnjVar;
                int ordinal = dpgoVar.a.ordinal();
                if (ordinal == 0) {
                    drojVar = droj.MINI_CAMERA;
                } else if (ordinal == 1) {
                    drojVar = droj.FULLSCREEN;
                } else {
                    if (ordinal != 2) {
                        throw new ffcd();
                    }
                    drojVar = droj.POPUP_CAMERA;
                }
                drojVar.getClass();
                drohVar.copyOnWrite();
                drol drolVar = (drol) drohVar.instance;
                drolVar.c = drojVar.a();
                drolVar.b |= 1;
                int i4 = dpgoVar.e - 1;
                droi droiVar = i4 != 1 ? i4 != 2 ? droi.CAMERA_FACING_UNKNOWN : droi.FRONT : droi.BACK;
                droiVar.getClass();
                drohVar.copyOnWrite();
                drol drolVar2 = (drol) drohVar.instance;
                drolVar2.d = droiVar.a();
                drolVar2.b |= 2;
                int i5 = dpgoVar.f - 1;
                drok drokVar = i5 != 1 ? i5 != 2 ? drok.ORIENTATION_UNKNOWN : drok.LANDSCAPE : drok.PORTRAIT;
                drokVar.getClass();
                drohVar.copyOnWrite();
                drol drolVar3 = (drol) drohVar.instance;
                drolVar3.e = drokVar.a();
                drolVar3.b |= 4;
                boolean z = dpgoVar.b;
                drohVar.copyOnWrite();
                drol drolVar4 = (drol) drohVar.instance;
                drolVar4.b |= 8;
                drolVar4.f = z;
                String str2 = dpgoVar.d;
                if (str2 != null) {
                    drohVar.copyOnWrite();
                    drol drolVar5 = (drol) drohVar.instance;
                    drolVar5.b |= 16;
                    drolVar5.g = str2;
                }
                eyfy build8 = drohVar.build();
                build8.getClass();
                drnuVar.copyOnWrite();
                droo drooVar4 = (droo) drnuVar.instance;
                drooVar4.d = (drol) build8;
                drooVar4.c = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
            } else if (drnjVar instanceof dpgq) {
                drom dromVar = (drom) dron.a.createBuilder();
                dromVar.getClass();
                eyfy build9 = dromVar.build();
                build9.getClass();
                drnuVar.copyOnWrite();
                droo drooVar5 = (droo) drnuVar.instance;
                drooVar5.d = (dron) build9;
                drooVar5.c = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
            } else if (drnjVar instanceof dqzn) {
                droa droaVar = ((dqzn) drnjVar).c;
                drnuVar.copyOnWrite();
                droo drooVar6 = (droo) drnuVar.instance;
                drooVar6.d = droaVar;
                drooVar6.c = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
            }
        }
        return dros.a(drnuVar);
    }
}
