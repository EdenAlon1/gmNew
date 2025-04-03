package defpackage;

import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afr implements bcd {
    public final CaptureResult a;
    private final bgw b;

    public afr(bgw bgwVar, CaptureResult captureResult) {
        this.b = bgwVar;
        this.a = captureResult;
    }

    @Override // defpackage.bcd
    public final long a() {
        Long l = (Long) this.a.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // defpackage.bcd
    public final CaptureResult b() {
        return this.a;
    }

    @Override // defpackage.bcd
    public final bby c() {
        Integer num = (Integer) this.a.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return bby.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return bby.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return bby.CONVERGED;
            }
            if (intValue == 3) {
                return bby.LOCKED;
            }
            if (intValue == 4) {
                return bby.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                Objects.toString(num);
                avw.c("C2CameraCaptureResult", "Undefined ae state: ".concat(num.toString()));
                return bby.UNKNOWN;
            }
        }
        return bby.SEARCHING;
    }

    @Override // defpackage.bcd
    public final bbz d() {
        Integer num = (Integer) this.a.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return bbz.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                Objects.toString(num);
                avw.c("C2CameraCaptureResult", "Undefined af state: ".concat(num.toString()));
                break;
        }
        return bbz.UNKNOWN;
    }

    @Override // defpackage.bcd
    public final bca e() {
        Integer num = (Integer) this.a.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return bca.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return bca.INACTIVE;
        }
        if (intValue == 1) {
            return bca.METERING;
        }
        if (intValue == 2) {
            return bca.CONVERGED;
        }
        if (intValue == 3) {
            return bca.LOCKED;
        }
        Objects.toString(num);
        avw.c("C2CameraCaptureResult", "Undefined awb state: ".concat(num.toString()));
        return bca.UNKNOWN;
    }

    @Override // defpackage.bcd
    public final bgw f() {
        return this.b;
    }

    @Override // defpackage.bcd
    public final void g(bif bifVar) {
        CaptureResult.Key key;
        bcb.a(this, bifVar);
        try {
            Integer num = (Integer) this.a.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bifVar.c(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            avw.f("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        if (((Long) this.a.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            bifVar.b("ExposureTime", String.valueOf(r0.longValue() / TimeUnit.SECONDS.toNanos(1L)));
        }
        Float f = (Float) this.a.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bifVar.b("FNumber", String.valueOf(f.floatValue()));
        }
        Integer num2 = (Integer) this.a.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            CaptureResult captureResult = this.a;
            key = CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;
            if (((Integer) captureResult.get(key)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            int intValue = num2.intValue();
            bifVar.b("SensitivityType", "3");
            bifVar.b("PhotographicSensitivity", String.valueOf(Math.min(65535, intValue)));
        }
        Float f2 = (Float) this.a.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bifVar.b("FocalLength", new bil((long) (f2.floatValue() * 1000.0f), 1000L).toString());
        }
        Integer num3 = (Integer) this.a.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            bifVar.b("WhiteBalance", (num3.intValue() == 0 ? 2 : 1) + (-1) != 0 ? "1" : "0");
        }
    }

    @Override // defpackage.bcd
    public final int h() {
        Integer num = (Integer) this.a.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return 3;
            }
            if (intValue == 3 || intValue == 4) {
                return 4;
            }
            if (intValue != 5) {
                Objects.toString(num);
                avw.c("C2CameraCaptureResult", "Undefined af mode: ".concat(num.toString()));
                return 1;
            }
        }
        return 2;
    }

    @Override // defpackage.bcd
    public final int i() {
        Integer num = (Integer) this.a.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return 2;
        }
        if (intValue == 2) {
            return 3;
        }
        if (intValue == 3 || intValue == 4) {
            return 4;
        }
        Objects.toString(num);
        avw.c("C2CameraCaptureResult", "Undefined flash state: ".concat(num.toString()));
        return 1;
    }
}
