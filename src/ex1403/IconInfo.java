package ex1403;

import java.awt.Image;

public interface IconInfo {
	int Icon_16x16 = 1;
	int Icon_32x32 = 2;
	Image getIcon(int iconType);
}
